package io.ace.springframework.core.validator.propertyeditor;

import org.springframework.context.support.ClassPathXmlApplicationContext;




public class PropertyEditorExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("validator/customEditorContext.xml");
        DependsOnExoticType bean = context.getBean(DependsOnExoticType.class);
        System.out.println(bean.getExoticType());
    }

}
