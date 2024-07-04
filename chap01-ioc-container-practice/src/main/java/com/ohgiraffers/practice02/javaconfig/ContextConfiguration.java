package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean("board")
    public BoardDTO getBoard(){

        System.out.println("getBoard 호출함");
        return new BoardDTO("1212", "강연진","숙제","home");
    }

}
