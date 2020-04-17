package io.ace.springframework.core.ioc.classpathscanning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {
    private static int i;

    @Bean
    @Qualifier("public")
    public TestBean publicTestBean() {
        return new TestBean("Public Bean");
    }

    @Bean
    private TestBean privateTestBean() {
        return new TestBean("Private Test Bean", i++);
    }

    @Bean
    protected TestBean protectedTestBean(@Value("#{privateTestBean.value}") Integer value) {
        return new TestBean("Protected Test Bean", value);
    }

}
