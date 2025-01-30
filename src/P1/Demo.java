package P1;

public class Demo {
    public static void main(String[] args) {
//        Reverse String

        String name = new String("Kavindu Pramod");
        StringBuffer reverseString = new StringBuffer("");

        for (int i = name.length()-1; i >= 0; i--) {
            reverseString.append(name.charAt(i));
        }

        System.out.println("Reverse String is : "+reverseString);
    }
}
