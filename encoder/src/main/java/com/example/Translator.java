package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    private Scanner message;
    private String textMessage;
    private String translatedMessage = "";


    public void translates(HashMap<Character, Character> enMap, HashMap<Character, Character> ruMap){
            System.out.println("введите tr для расшифровки или t для зашифровки: ");
             getText();


            if (textMessage.equals("tr")){
                getText();
                for (int i = 0; i < textMessage.length(); i++){
                    if (enMap.containsKey(textMessage.charAt(i))) {
                        translatedMessage = translatedMessage + enMap.get(textMessage.charAt(i)).toString();
                    }else{
                        System.out.println("не верный ключ");
                        translatedMessage = "";
                        break;
                    }
                }
            } else if (textMessage.equals("t")) {
                getText();
                textMessage = textMessage.toLowerCase();
                for (int i = 0; i < textMessage.length(); i++){
                    if (ruMap.containsKey(textMessage.charAt(i))){
                        translatedMessage = translatedMessage + ruMap.get(textMessage.charAt(i)).toString();
                    }else{
                        System.out.println("не кодируется символ " + textMessage.charAt(i));
                        translatedMessage = "";
                        break;

                    }
                }
            }else{
                System.out.println("команда отсутствует");
            }
        System.out.println(translatedMessage);
        translatedMessage = "";
    }

    private void getText(){
        message = new Scanner(System.in);
        textMessage = message.nextLine();
    }
}

