package com.practice.aop.frameworkAOPServices.aopNamespace.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AopNamestaceExampleDemo {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-aop-namespace-complex.xml");
        ctx.refresh();
        NewDocumentarist documentarist =
                ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();
        ctx.close();
    }
}
