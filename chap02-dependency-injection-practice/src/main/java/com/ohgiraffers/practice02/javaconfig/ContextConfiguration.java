package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean("member")
    public MemberDTO memberGenerator(){
        MemberDTO member = new MemberDTO();
        member.setId(1L);
        member.setNickname("홍길동");

        return member;
    }

    @Bean("board")
    public BoardDTO boardGenerator(){

        BoardDTO board = new BoardDTO();
        board.setId(1L);
        board.setTitle("제목");
        board.setContent("내용");
        board.setWriter(memberGenerator());

        return board;
    }

}
