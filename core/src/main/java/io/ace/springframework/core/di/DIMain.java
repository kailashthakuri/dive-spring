package io.ace.springframework.core.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContextDI.xml");
//        TextEditor textEditor = appContext.getBean(TextEditor.class);
//        textEditor.spellCheck();

        TextEditorSetter textEditorSetter = appContext.getBean(TextEditorSetter.class);
        textEditorSetter.checkSpelling();
    }
}
