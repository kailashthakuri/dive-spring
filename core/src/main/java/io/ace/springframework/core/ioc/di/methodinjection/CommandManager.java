package io.ace.springframework.core.ioc.di.methodinjection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CommandManager implements ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public Object process() {
        Command command = getCommand();
        /**
         * here we can process command with new instance of command object.
         */
        return null;
    }

    private Command getCommand() {
        return this.applicationContext.getBean(Command.class);
    }
}
