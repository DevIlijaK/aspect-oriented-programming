package com.practice.aop.frameworkAOPServices.aopNamespace.simpleExample;

import com.practice.aop.frameworkAOPServices.proxyBeanFactory.advice.Documentarist;
import com.practice.aop.pointcuts.nameMatching.Guitar;

public class NewDocumentarist extends Documentarist {
    @Override
    public void execute() {
        guitarist.sing();
        guitarist.sing(new Guitar());
        guitarist.talk();
    }
}
