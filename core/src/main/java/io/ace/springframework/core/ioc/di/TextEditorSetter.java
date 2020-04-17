package io.ace.springframework.core.ioc.di;

public class TextEditorSetter {

    private SpellCheckSetter spellCheckSetter;

    public SpellCheckSetter getSpellCheckSetter() {
        return spellCheckSetter;
    }

    public void setSpellCheckSetter(SpellCheckSetter spellCheckSetter) {
        this.spellCheckSetter = spellCheckSetter;
    }

    public void checkSpelling() {
        System.out.println("TextEditorSetter#chekSpelling method called.");
        this.spellCheckSetter.spellChecking();
    }
}
