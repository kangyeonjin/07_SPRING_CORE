package com.ohgiraffers.section01.annotationconfig.subsection01;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

public class ContextConfiguration {

    @ComponentScan(basePackages = "com.ohgiraffers",
    useDefaultFilters = false,
    includeFilters = {
            @ComponentScan.Filter(
                    type = FilterType.ASSIGNABLE_TYPE,
                    classes = {MemberDAO.class}
            )
    }
    )

    @Configuration("contextConfiguration")
    public class ContextConfiguragion{

    }

}
