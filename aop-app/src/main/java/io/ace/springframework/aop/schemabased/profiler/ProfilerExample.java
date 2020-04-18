package io.ace.springframework.aop.schemabased.profiler;

import io.ace.springframework.aop.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProfilerExample {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("profilerContext.xml");
        PersonService personService = (PersonService) context.getBean("personService");
        System.out.println(personService.getPerson("Kailash", 23));
    }


}
