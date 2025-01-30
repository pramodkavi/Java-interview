package P14;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        String word = "Kavind Pramod";

        findNoOfVowels(word);
    }

    private static void findNoOfVowels(String word) {
        String lowercaseWord = word.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

//        intialize the map
        for (char chr :
                "aeiou".toCharArray()) {
            map.put(chr,0);
        }

        for (char chr :
                word.toCharArray()) {
            if (map.containsKey(chr)) {
                map.put(chr,map.get(chr)+1);
            }
        }
        System.out.println(map);
    }
}
