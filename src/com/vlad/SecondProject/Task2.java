package com.vlad.SecondProject;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    private List<PartOfLanguage> sentences = new ArrayList<>();


    public List<PartOfLanguage> getSentences() {
        return sentences;
    }

    public void setSentences(List<PartOfLanguage> sentences) {
        this.sentences = sentences;
    }


    public Task2(String text) {
        text=text.replaceAll("\\s+", " ");

        String sentence = "";
        for (Character c :
                text.toCharArray()) {
            String c1 = c.toString();
            sentence += c1;

            if (c1.matches("[.!?]")){

                System.out.println(sentence);
            sentences.add(new Sentence(sentence.trim())); sentence="";
            }
        }


    }


    public void printSentences() {
        sentences.stream().map(PartOfLanguage::get).forEach(System.out::println);

    }

    public void printSorted() {
        sentences.stream().sorted().map(PartOfLanguage::get).forEach(System.out::println);

    }
}