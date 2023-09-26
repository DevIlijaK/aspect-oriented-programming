package com.practice.aop.frameworkAOPServices.aspectJStyleAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.practice.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}
