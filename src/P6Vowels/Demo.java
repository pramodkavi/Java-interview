package P6Vowels;

public class Demo {
    public static void main(String[] args) {
        String str = "Kavindu";

        noOfVawels(str);
    }

    private static void noOfVawels(String str) {
        String vowels = "aeiou";
        String lowerCaseStr = str.toLowerCase();
        char[] charArray = lowerCaseStr.toCharArray();

        int noOfVowelsChar = 0;
        for (char chr :
                charArray) {
            if(vowels.contains(chr+"")){
                noOfVowelsChar++;
            }
        }
        System.out.println(noOfVowelsChar);
    }
}
