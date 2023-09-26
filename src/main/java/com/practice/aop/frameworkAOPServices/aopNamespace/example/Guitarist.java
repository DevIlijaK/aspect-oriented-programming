package com.practice.aop.frameworkAOPServices.aopNamespace.example;

public class Guitarist {
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
