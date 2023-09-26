package com.practice.aop.frameworkAOPServices.aspectJStyleAnnotations;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AspectJAnnotationDemo {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:spring/aspectj/app-context-aspectj.xml");
        ctx.refresh();
        NewDocumentarist documentarist =
                ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();
    }
}
