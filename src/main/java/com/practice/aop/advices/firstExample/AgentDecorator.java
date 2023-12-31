package com.practice.aop.advices.firstExample;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AgentDecorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("James ");
        Object retVal = invocation.proceed();
        System.out.print("!");
        return retVal;
    }
}
