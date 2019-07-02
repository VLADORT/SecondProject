package com.vlad.SecondProject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "У дуже колись дуже дуже був друг, що любив ходити на прогулянки на. Потім ми дуже ми гуляли! Ти з нами ми?";
        Task2 task2= new Task2(input);
        task2.printSentences();
        System.out.println("==================");
        task2.printSorted();
        String[] words =  {"дуже","на","ми"};
        System.out.println(Arrays.toString(words));
        Task10 task10 = new Task10(input, words );
        task10.printSortedWords();

    }
}
