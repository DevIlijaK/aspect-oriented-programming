package com.practice.aop.frameworkAOPServices.aopNamespace.example;

public class NewDocumentaristAround extends Documentarist{
    @Override
    public void execute() {
        guitarist.sing();
        Guitar guitar = new Guitar();
        guitar.setBrand("Gibson");
        guitarist.sing(guitar);
        guitarist.sing(new Guitar());
        guitarist.talk();
    }
}
