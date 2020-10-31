package com.edu.algoexpert.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {
        if (words == null || words.size() == 0) {
            return List.of();
        } else if (words.size() == 1) {
            return List.of(List.of(words.get(0)));
        }

        String[] sortedWords = new String[words.size()];
        int i = 0;
        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            sortedWords[i] = new String(arr);
            i++;
        }

        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, Integer> idxs = new HashMap<>();
        int idx = 0;
        for (i = 0; i < sortedWords.length; i++) {
            String str = sortedWords[i];
            int id;
            if (idxs.containsKey(str)) {
                id = idxs.get(str);
            } else {
                id = idx++;
                idxs.put(str, id);
            }
            if (id == res.size()) {
                res.add(new ArrayList<>());
            }
            res.get(id).add(words.get(i));
        }
        return res;
    }
}
