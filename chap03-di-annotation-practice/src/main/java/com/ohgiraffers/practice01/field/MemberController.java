package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller("controller")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Bean
    public Map<Long, MemberDTO> selectMember() {
        return memberService.selectMember();
    }



}
