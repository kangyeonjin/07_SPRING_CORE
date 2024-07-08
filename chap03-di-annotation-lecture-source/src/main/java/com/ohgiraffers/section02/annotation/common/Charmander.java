package com.ohgiraffers.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*@primary
* @autowired로 동일한 타입의 여러 bean을 찾게 되는경우 자동으로 연결된 우선시 할 타입으로 설정된다
* 동일한타입의 클래스 중 한개만 @primary어노테이션을 사용할수있다.*/

@Primary
@Component
public class Charmander implements Pokemon{
    @Override
    public void attack(){
        System.out.println("파이리 불꽃 공격🔥🔥🔥");
    }

}
