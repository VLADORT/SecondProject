package com.vlad.SecondProject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Word implements PartOfLanguage {
    private String word;
    
    private List<Sign> signs;

    public Word(String word) {
        this.word = word;
        signs= Stream.of(word.split(""))
                .map(Sign::new)
                .collect(Collectors.toList());

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String get() {
        return this.word;
    }
}
