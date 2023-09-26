package com.practice.aop.frameworkAOPServices.aopNamespace.example;

public class Documentarist {
    public Guitarist guitarist;
    public void execute() {
        guitarist.sing();
        guitarist.talk();
    }
    public void setGuitarist(Guitarist guitarist) {
        this.guitarist = guitarist;
    }
}
