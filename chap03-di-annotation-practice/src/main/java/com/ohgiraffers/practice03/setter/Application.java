package com.ohgiraffers.practice03.setter;

import com.ohgiraffers.practice02.constructor.MemberController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.practice03.setter");
        MemberController controller = context.getBean("controller", MemberController.class);
        System.out.println(controller);

    }


}
