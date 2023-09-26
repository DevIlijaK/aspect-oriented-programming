package com.practice.aop.frameworkAOPServices.aopNamespace.simpleExample;

import org.aspectj.lang.JoinPoint;

public class SimpleAdvice {
    public void simpleBeforeAdvice(JoinPoint joinPoint) {
        System.out.println("Executing: " +
                joinPoint.getSignature().getDeclaringTypeName() + " "
                + joinPoint.getSignature().getName());
    }
}
