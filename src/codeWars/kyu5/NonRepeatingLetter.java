package codeWars.kyu5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NonRepeatingLetter {

    public static String firstNonRepeatingLetter(String s){
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i<s.length(); i++){
            stringList.add(s.charAt(i)+"");
        }

        stringList = stringList.stream()
                .map(string ->
                {
                    if(string.matches("[a-z]")){
                    return string.toUpperCase();
                    }else return string;
                })
                .collect(Collectors.toList());


        char[] charsNotUppercase = s.toCharArray();
        Map<String,Long> map = new HashMap<>();

        // Fill Hashmap for Characters with value 1 or 2
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(stringList.get(i))) map.put(stringList.get(i), 2L);
            else {
                map.put(stringList.get(i), 1L);
            }
        }

        // Find non repeating char

        List<String> finalStringList = stringList;
        Optional<String> string = IntStream.range(0, s.length())
                .mapToObj(i -> finalStringList.get(i))
                .filter(c -> map.containsKey(c) && map.get(c) == 1L)
                .findFirst();

        if(string.isPresent()){
        int i = stringList.indexOf(string.get());
        return charsNotUppercase[i] + "";
        } else return "";
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("∞§ﬁ›ﬂ∞§"));
    }

}
