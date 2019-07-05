package com.vlad.SecondProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sentence implements Comparable<Sentence>, PartOfLanguage {

    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<PartOfLanguage> getWords() {
        return words;
    }

    public void setWords(List<PartOfLanguage> words) {
        this.words = words;
    }

    private List<PartOfLanguage> words = new ArrayList<>();

    public Sentence(String sentence) {
        this.sentence = sentence;
        List<Word> wordList = new ArrayList<>();
        wordList = Stream.of(sentence.split(" "))
                .map(word -> new Word(word.trim()))
                .collect(Collectors.toList());
        for (Word word :
                wordList) {
            if (word.get().matches("[.,;?!]")) {

                words.add(new Word(word.get().substring(0, word.get().length() - 2)));
                System.out.println(word.get().substring(word.get().length() - 2));
                words.add(new DivSign(word.get().substring(word.get().length() - 2)));
                System.out.println(word.get().substring(word.get().length() - 2));
            }
            else
                words.add(new Word(word.get()));

        }

    }

    public int countWords() {

        return words.size();
    }

    @Override
    public int compareTo(Sentence o) {
        return this.countWords() - o.countWords();
    }

    @Override
    public String get() {
        return sentence;
    }
}
