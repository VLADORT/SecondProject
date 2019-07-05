package com.vlad.SecondProject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Task10 {

    private String[] words;

    private Map<String, Long> sort = new HashMap<>();

    private List<Sentence> sentences = new ArrayList<>();


    public Task10(String text, String[] words) {
        this.words = words;
        this.sentences.addAll(Stream.of(text.split("[.!?]")).map(s -> new Sentence(s.trim())).collect(Collectors.toList()));
        for (String word :
                words) {

            long occurrence = 0;

            for (Sentence sentence :
                    sentences) {
                System.out.println(sentence.getWords().stream().filter(word1 -> word.equals(word1.get())).count());
                occurrence += sentence.getWords().stream().filter(word1 -> word.equals(word1.get())).count();
            }
            System.out.println("General number of occurs: " + occurrence);
            sort.put(word, occurrence);
        }

    }

    public void printSortedWords() {
        System.out.println(sort.entrySet());
        sort = sort.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        System.out.println(sort.keySet());


    }


}
