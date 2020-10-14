package com.codegym;

import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap();
        String str = "a short part of a text, consisting of at least one sentence and beginning on a new line. It usually deals with a single event, description, idea, etc.";
        str = str.toLowerCase();
        String[] strArr = str.split(" ");

        for (String s : strArr) {
            if (treeMap.containsKey(s)) {
                treeMap.put(s, treeMap.get(s) + 1);
            } else {
                treeMap.put(s, 1);
            }
        }

        Set<String> keySet = treeMap.keySet();
        for(String key : keySet){
            System.out.println(key + " - " + treeMap.get(key));
        }
    }
}
