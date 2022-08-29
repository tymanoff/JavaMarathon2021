package Ylab.Task2;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
    public static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder(str);
        return str.equalsIgnoreCase(sb.reverse().toString());
    }
}
