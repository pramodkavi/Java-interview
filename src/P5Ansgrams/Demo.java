package P5Ansgrams;

public class Demo {
    public static void main(String[] args) {
        String s1 = "kavidu";
        String s2 = "duiavk";

        boolean status = checkAnagramStatus(s1 , s2);
        System.out.println("Status : "+status);
    }

    private static boolean checkAnagramStatus(String s1, String s2) {
        if(s1.length()!= s2.length())
            return false;

        for (int i = 0; i < s2.length(); i++) {
            if(!s1.contains(""+s2.charAt(i))){
                return false;
            }
        }
        return true;
    }

//    str1 = str1.replaceAll("\\s", "").toLowerCase();
//    str2 = str2.replaceAll("\\s", "").toLowerCase();
//
//    // Check if lengths are different
//        if (str1.length() != str2.length()) {
//        return false;
//    }
//
//    // Convert strings to character arrays
//    char[] charArray1 = str1.toCharArray();
//    char[] charArray2 = str2.toCharArray();
//
//    // Sort the character arrays
//        Arrays.sort(charArray1);
//        Arrays.sort(charArray2);
//
//    // Compare the sorted arrays
//        return Arrays.equals(charArray1, charArray2);

}
