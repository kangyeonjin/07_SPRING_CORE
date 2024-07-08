package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        //XML설정 파일을 기반으로 ApplicationContext생성
        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member);
        //Member DTO의 PersonalAccount객체 출력
        System.out.println(member.getPersomalAccount());
        //1000원입금
        System.out.println(member.getPersomalAccount().deposit(10000));
        //잔액출력
        System.out.println(member.getPersomalAccount().getBalance());
        //5000원 출금
        System.out.println(member.getPersomalAccount().withDraw(5000));

        System.out.println(member.getPersomalAccount().getBalance());


    }

}
