package io.ace.springframework.core.di;

public class SpellChecker {


    private String dictionary;

    public SpellChecker(String dictionary) {
        this.dictionary = dictionary;
        System.out.println("Inside SpellChecker#constructor.");
    }

    public void checkSpelling() {
        System.out.println("Inside SpellChecker#checkSpelling method.");
    }
}
