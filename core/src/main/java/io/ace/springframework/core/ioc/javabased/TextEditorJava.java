package io.ace.springframework.core.ioc.javabased;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditorJava {

    @Autowired
    private SpellCheckerJava spellCheckerJava;

    public SpellCheckerJava getSpellCheckerJava() {
        return spellCheckerJava;
    }

    public void spellCheck() {
        System.out.println("TextEditorJava#spellCheck method called.");
        this.spellCheckerJava.checkSpelling();
    }

}
