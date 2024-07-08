package com.ohgiraffers.practice03.annotationconfig;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScans(basePackages = "com.ohgiraffers.practice03.annotationconfig",

        useDefaultFilters = false,
         includeFilters={
        @ComponentScans.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = {BoardDAO.class}
        )

        }
                )

@Configuration("contextconfiguration")
   public class Contextconfiguration {

}

