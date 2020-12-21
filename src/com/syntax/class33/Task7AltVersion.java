package com.syntax.class33;

import java.util.LinkedHashSet;

public class Task7AltVersion {
    public static String wordsConcat(LinkedHashSet<String> words){
            String concatString="";
            for (String word:words){
                concatString=concatString+word;
            }
            return concatString;
        }
        public static void main(String[] args) {
            LinkedHashSet<String> words = new LinkedHashSet<>();
            words.add("Hello");
            words.add("my");
            words.add("name");
            words.add("is");
            words.add("Denis");
            System.out.println(wordsConcat(words));
        }
    }

