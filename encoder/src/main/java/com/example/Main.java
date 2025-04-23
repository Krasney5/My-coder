package com.example;

import java.util.HashMap;

public class Main {

    private static final KeyGenerator keyGenerator = new KeyGenerator();
    private static final KeyReader keyReader = new KeyReader();
    private static HashMap<Character, Character> enLettersMap = new HashMap<>();
    private static HashMap<Character, Character> ruLettersMap = new HashMap<>();
    private static Translator translator = new Translator();


    public static void main(String[] args) {
        keyGenerator.GeneratorFile();
        keyReader.reading(enLettersMap, ruLettersMap);
        while(true){
            translator.translates(enLettersMap, ruLettersMap);
        }
    }

}