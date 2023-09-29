package com.practice.aop.introductions;

import org.springframework.aop.IntroductionAdvisor;
import org.springframework.aop.framework.ProxyFactory;

public class IntroductionDemo {

    public static void main(String... args) {
        Contact target = new Contact();
        target.setName("John Mayer");

        IntroductionAdvisor advisor = new IsModifiedAdvisor();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        /**
         * Notice that when we are creating the proxy, we set the optimize flag to true to force the use of the
         * CGLIB proxy. The reason for this is that when you are using the JDK proxy to introduce a mixin, the resulting
         * proxy will not be an instance of the object class (in this case Contact); the proxy implements only the mixin
         * interfaces, not the original class. With the CGLIB proxy, the original class is implemented by the proxy along
         * with the mixin interfaces.
         */
        pf.setOptimize(true);


        Contact proxy = (Contact) pf.getProxy();
        IsModified proxyInterface = (IsModified) proxy;
        System.out.println("Is Contact?: " + (proxy instanceof Contact));
        System.out.println("Is IsModified?: " + (proxy instanceof IsModified));
        System.out.println("Has been modified?: " +
                           proxyInterface.isModified());
        proxy.setName("John Mayer");
        System.out.println("Has been modified?: " +
                           proxyInterface.isModified());
        proxy.setName("Eric Clapton");
        System.out.println("Has been modified?: " +
                           proxyInterface.isModified());
    }
}
