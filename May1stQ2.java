//String Palindrome

import java.util.Scanner;

public class May1stQ2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter character: ");

        String str = name.nextLine();
        String reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
