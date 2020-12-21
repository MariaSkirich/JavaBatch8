package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> citiesCountries=new TreeMap<>();
        citiesCountries.put("USA", "Washington DC");
        citiesCountries.put("Ukraine", "Kiev");
        citiesCountries.put("Russia", "Moscow");
        citiesCountries.put("France", "Paris");
        citiesCountries.put("Czech Republic", "Prague");
        citiesCountries.put("Greece", "Athens");

        Set<String> citiesCountriesSet=citiesCountries.keySet();


        for (String country:citiesCountriesSet) {
            System.out.println(country+" "+citiesCountries.get(country));
        }
        Set<Map.Entry<String, String>> countriesSet=citiesCountries.entrySet();
        Iterator<Map.Entry<String, String>> iterator=countriesSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
