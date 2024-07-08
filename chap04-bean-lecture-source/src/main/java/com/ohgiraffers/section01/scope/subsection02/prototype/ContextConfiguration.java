package com.ohgiraffers.section01.scope.subsection02.prototype;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carBread(){
        return new Bread("붕어빵", 1000, LocalDate.now());

    }

    public Product milk(){
        return new Beverage("딸기우유", 1500, 500);
    }


}
