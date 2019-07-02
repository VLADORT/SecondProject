package com.vlad.SecondProject;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {


    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    private List<Sentence> sentences;

    public Task2(String text) {

        sentences = Stream.of(text.replaceAll("\\s+", " ").split("[.!?]")).map(s -> new Sentence(s.trim())).collect(Collectors.toList());
    }


    public void  printSentences() {
        sentences.stream().map(Sentence::getSentence).forEach(System.out::println);

    }
    public void printSorted() {
        sentences.stream().sorted().map(Sentence::getSentence).forEach(System.out::println);

    }
}