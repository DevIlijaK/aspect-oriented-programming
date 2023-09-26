package com.practice.aop.advices.beforeAdviceSecurity;

public class SecureBean {
    public void writeSecureMessage() {
        System.out.println("This message can only be seen by logged in users");
    }
}
