package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDAO;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

public class Contextconfiguration {

@ComponentScans(basePackages = "com.ohgiraffers.practice03.annotationconfig",

        useDefaultFilters = false,
        includeFilters={
        @ComponentScans.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = {BoardDAO.class}
        )

        }
)
@Configuration("contextConfiguration")
   public class ContextConfiguration{

}
}
