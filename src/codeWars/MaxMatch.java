package codeWars;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

class MaxMatch {
    public static List<String> maxMatch(String sentence){
        List<String> res = new ArrayList<String>();
        String word ="";
        // Preloaded.VALID_WORDS.contains("happy") == true
        int i = sentence.length();
        while (sentence.length()>0 && i != 0){
            word = sentence.substring(0,i);

            if (Preloaded.VALID_WORDS.contains(word) || i == 1){
                res.add(word);
                sentence = sentence.substring(i);
                i = sentence.length()+1;
            };
            i--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxMatch("asdfhellodarlingasdf"));
    }

    public static class Preloaded {
        public static final Set<String> VALID_WORDS = Set.of(
                "love", "java", "can", "apple", "pie", "is", "good", "hello", "darling"
                // ... hier wären die ca. 50 Wörter
        );
    }
}




