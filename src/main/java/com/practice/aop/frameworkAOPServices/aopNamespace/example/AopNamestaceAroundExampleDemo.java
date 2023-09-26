package com.practice.aop.frameworkAOPServices.aopNamespace.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AopNamestaceAroundExampleDemo {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-aop-namespace-complex-around.xml");
        ctx.refresh();
        NewDocumentaristAround documentarist =
                ctx.getBean("documentarist", NewDocumentaristAround.class);
        documentarist.execute();
        ctx.close();
    }
}
