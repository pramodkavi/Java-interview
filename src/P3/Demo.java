package P3;

public class Demo {
    public static void main(String[] args) {
        String word = "LOL";
        StringBuffer stringBuffer = reverseString(word);

        String string = stringBuffer.toString();
        checkPalindrom(word,string);

    }
    public static StringBuffer reverseString(String str){
        StringBuffer reverseStr = new StringBuffer("");
        for (int i = str.length()-1; i >=0; i--) {
            reverseStr.append(str.charAt(i));
        }
        return reverseStr;
    }

    public static void checkPalindrom(String str1, String str2){
        System.out.println(str1.equals(str2));
    }
}
