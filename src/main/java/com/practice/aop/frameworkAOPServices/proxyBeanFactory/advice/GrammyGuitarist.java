package com.practice.aop.frameworkAOPServices.proxyBeanFactory.advice;

import com.practice.aop.pointcuts.nameMatching.Guitar;

public class GrammyGuitarist {
    public void sing() {
        System.out.println("sing: Gravity is working against me\n" +
                "And gravity wants to bring me down");
    }

    public void sing(Guitar guitar) {
        System.out.println("play: " + guitar.play());
    }

    public void talk(){
        System.out.println("talk");
    }
}
