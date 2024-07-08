package com.ohgiraffers.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //PointCut, advice
    /*
     * @pointcut :  여러 조인 포인트를 매치하기 위한 표현식
     * exefution([수식어]리턴타입[클래스이름]이름.(파라미터))
     * 수식어 생략가능 (접근제어자) public private protected default
     * *service.*(..)매개변수가 0개이상인 모든메서드
     * *service.*(*)매개변수가 1개인 모든 메서드
     * *service.*(*,..)매개변수가 2개인 모든 메서드*/

    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void logPointcut(){}

    /*joinpoint :포인트 컷으로 패치한 실행 지점
    *joinpoint객체에서 현재 조인 포인트의메소드명, 인수값등의 정보를 엑세스 할수있다
    * */

    @Before("logPointcut()")
    public void logBefore(JoinPoint joinPoint){

        //조인포인트에서 할일 .advice
        System.out.println("Before joinPoint.getTarget():"+joinPoint.getTarget());
        System.out.println("Before joinPoint.getSignature():"+joinPoint.getSignature());

        if(joinPoint.getArgs().length>0){ //매개변수
            System.out.println(joinPoint.getArgs()[0]);
        }
    }

    @After("logPointcut()")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("After joinPoint.getTarget():"+joinPoint.getTarget());
        System.out.println("After joinPoint.getSignature():"+joinPoint.getSignature());

        if(joinPoint.getArgs().length>0){ //매개변수
            System.out.println(joinPoint.getArgs()[0]);
        }
    }

    //리턴받은 값을 가공하는 형태로 사용된다.
    @AfterReturning(pointcut = "logPointcut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println("AfterReturning result:" +result);
    }

    //AfterThrowing
    //->throwing 속성의 이름과 매개변수이름이 동일해야한다
    @AfterThrowing(pointcut = "logPointcut()", throwing = "exception")
    public void logAfterThrowing(Throwable exception){
        System.out.println(exception);

    }

    /*Around Advice
    * 조인포인트를 완전히 장악한다
    * 앞에서의 어드바이스 모두 around어드바이스로 조횝가능하다
    * aroundAdvice의 조인포인트매개변수는 proceedingJoinPoint로 고정되어 있기 떄문에
    * joinPoint의 하위 인터페이스로 원본조인포인트의 진행시점을 제어할수있다.
    * 조인포인트진행하는 호출을 잊는 경우 많이 발생하기 떄문에
    * 최소한의 요건을 충족하면서도 가장 기능이 약한 어드바이스를 쓰는게 바람직하다 */

    @Around("logPointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint)throws Throwable{
        //사전로직
        System.out.println(joinPoint.getSignature().getName());

        Object result = joinPoint.proceed();
        //사후로직
        System.out.println(joinPoint.getSignature().getName());
        return result;
    }



}
