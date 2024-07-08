package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ContextConfiguration {

    @Bean("account")
    public Account accountGernerator(){
        return new PersonalAccount(20, "110-234-4569");
    }

    @Bean("member")
    public MemberDTO memberGenerator(){

        /*memberDTO생성자를통해 Account를 생성하는메소드를호출 리턴값을 전달하여 bean을 조립할수있다*/

        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("홍길동");
        member.setPhone("010-1234-4567");
        member.setEmail("hong123@gmail.com");
        member.setPersomalAccount(accountGernerator());

        return member;
    }


}
