package com.ohgiraffers.practice03.setter;

import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.practice02.constructor.MemberDAO;
import com.ohgiraffers.practice02.constructor.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller("controller")
public class MemberController {

    private MemberService memberService;

//    @Autowired
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }


}

