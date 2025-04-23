package com.example;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;


public class KeyReader {
    private static final String PATH = "encoder/src/main/java/com/example/KeyFile/Key.txt";

    public void reading(HashMap<Character, Character> enLettersMap, HashMap<Character, Character> ruLettersMap){
        try {
            Path file = Paths.get(PATH);
            List<String> fileContent = Files.readAllLines(file);
            for(String line : fileContent){
                System.out.println(line);
                enLettersMap.put(line.charAt(2), line.charAt(0));
                ruLettersMap.put(line.charAt(0), line.charAt(2));
            }
        } catch (Exception e) {
            System.out.println("ошибка чтения ключа");
        }


    }
}

