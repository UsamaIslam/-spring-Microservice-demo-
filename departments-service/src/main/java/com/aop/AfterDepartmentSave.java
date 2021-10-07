package com.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AfterDepartmentSave {
    @After(value="execution(* com.services.DepartmentService.*(..)) ")
    public void after(JoinPoint joinPoint) {
        //Advice
        System.out.println();
        log.info(" Check for " +
                "-*=pok Department before access with name");
        System.out.println();

        log.info(" Allowed execution for {}", joinPoint);
        System.out.println();

    }
}
