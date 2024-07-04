package com.ohgiraffers.section01.annotationconfig.subsection.xml;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section/annotationconfig/subsection/xml/spring-context.xml");

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames){
            System.out.println("beanName : "+beanName);
        }


    }

}
