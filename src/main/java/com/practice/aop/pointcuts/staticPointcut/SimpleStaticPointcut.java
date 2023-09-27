package com.practice.aop.pointcuts.staticPointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(
            Method method,
            Class<?> targetClass
                          ) {
        System.out.println("Static check for class: " + targetClass.toString());
        System.out.println("Static check method name: " + method.getName());
        return ("sing".equals(method.getName()));
    }

    @Override
    public ClassFilter getClassFilter() {
        return cls -> (cls == GoodGuitarist.class);
    }
    //    public ClassFilter getClassFilter() {
    //        return new ClassFilter() {
    //            public boolean matches(Class<?> cls) {
    //                return (cls == GoodGuitarist.class);
    //            }
    //        };
    //    }
}
