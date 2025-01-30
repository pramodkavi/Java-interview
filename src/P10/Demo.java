package P10;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String word = "Kavindu Pramod afadf f adfa f ewwe ";
        removeSpaces(word);
    }

    private static void removeSpaces(String word) {
        char[] charArray = word.toCharArray();
        StringBuffer pureWord = new StringBuffer("");

        for (char chr :
                charArray) {
                if(chr != ' ') {
                    pureWord.append(chr);
                }
            }

        System.out.println(pureWord.toString());
    }
}
