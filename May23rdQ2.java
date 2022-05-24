import java.util.Arrays;

//java program to find if two strings are anagram
public class May23rdQ2 {
    public static void main(String[] args) {
       String string11 = "Brag";
       String string22 = "Grab";

       String string1 = string11.toLowerCase();
       String string2 = string22.toLowerCase();

       int string1Length = string1.length();
       int string2Length = string2.length();

       if (string1Length != string2Length){
           System.out.println("The string lengths are different so the strings cannot be anagram");
       } else {
           char[] stringOne = string1.toCharArray();
           char[] stringTwo = string2.toCharArray();

           Arrays.sort(stringOne);
           Arrays.sort(stringTwo);

           if (Arrays.equals(stringOne, stringTwo)){
               System.out.println("The string provided are anagram");
           }
       }

    }
}
