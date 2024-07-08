package com.ohgiraffers.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for(String names: beanNames){
            System.out.println(names);
        }

        //스프링 컨텍스트에 등록된 같은타입의 beam이 3개나 있다는뜻

        PokemonService pokemonService =context.getBean("pokemonServicePrivary",PokemonService.class);
        pokemonService.pokemonAttack();
    }

}
