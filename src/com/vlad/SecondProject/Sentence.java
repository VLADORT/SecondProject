package com.vlad.SecondProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sentence implements Comparable<Sentence> {

    private String sentence;

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    private List<Word> words;

    public Sentence(String sentence) {
        this.sentence = sentence;
        words= Stream.of(sentence.split("[ ]")).map(s -> new Word(s.trim())).collect(Collectors.toList());

   }

   public long getNumberOfOccurences(String word) {
        return words.stream().filter(word1 -> word.equals(word1.getWord())).count();
   }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;


    }

    public int countWords() {

        return words.size();
    }

    @Override
    public int compareTo(Sentence o) {
        return this.countWords()-o.countWords();
    }
}
