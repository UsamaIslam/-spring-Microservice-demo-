package com.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j

public class BeforeAndAfterDaprtmen {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Before("execution(* com.services.DepartmentService.*(..)) && args(id)")
    public void before(JoinPoint joinPoint,long id) {
        //Advice
        System.out.println();
        log.info(" Check for Department before access with id:"+id);
        System.out.println();

        log.info(" Allowed execution for {}", joinPoint);
        System.out.println();

    }


}
