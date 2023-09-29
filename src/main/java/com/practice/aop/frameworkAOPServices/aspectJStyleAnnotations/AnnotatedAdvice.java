package com.practice.aop.frameworkAOPServices.aspectJStyleAnnotations;

import com.practice.aop.frameworkAOPServices.aopNamespace.example.Guitar;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotatedAdvice {
    @Pointcut("execution(* com.practice.aop.frameworkAOPServices..sing*(" +
            "com.practice.aop.frameworkAOPServices.aopNamespace.example.Guitar)) && args(value)")
    public void singExecution(Guitar value) {
    }

    @Pointcut("bean(john*)")
    public void isJohn() {
    }

    @Before("singExecution(value) && isJohn()")
    public void simpleBeforeAdvice(JoinPoint joinPoint, Guitar value) {
        if (value.getBrand().equals("Gibson")) {
            System.out.println("Before advice, executing: " +
                    joinPoint.getSignature().getDeclaringTypeName() + " "
                    + joinPoint.getSignature().getName() + " argument: " + value.getBrand());
        }
    }
    @Around("singExecution(value) && isJohn()")
    public Object simpleAroundAdvice(ProceedingJoinPoint pjp,
                                     Guitar value) throws Throwable {
        System.out.println("\n");
        System.out.println("Around advice, before execution: " +
                pjp.getSignature().getDeclaringTypeName() + " "
                + pjp.getSignature().getName()
                + " argument: " + value.getBrand());
        Object retVal = pjp.proceed();
        System.out.println("Around advice, after execution: " +
                pjp.getSignature().getDeclaringTypeName() + " "
                + pjp.getSignature().getName()
                + " argument: " + value.getBrand());
        return retVal;
    }
}
