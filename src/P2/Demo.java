package P2;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String sentence = "It's raining cats and dogs";
        String[] splitArray = sentence.split(" ");

        String longWord = "";

        for (String str :
                splitArray) {
            if(longWord.length()<str.length())
                longWord  = str;
        }

        System.out.println(longWord);
    }
}
