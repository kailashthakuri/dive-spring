package io.ace.springframework.core.ioc.di;

public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor#constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        System.out.println("Inside TextEditor#spellCheck method.");
        this.spellChecker.checkSpelling();
    }

}
