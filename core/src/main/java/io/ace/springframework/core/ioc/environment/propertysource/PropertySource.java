package io.ace.springframework.core.ioc.environment.propertysource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

public class PropertySource {

    public static void main(String[] args) {
        ApplicationContext context = new GenericApplicationContext();
        Environment environment = context.getEnvironment();
        String javaHome = environment.getProperty("JAVA_HOME");
        System.out.println(javaHome);
    }


}
