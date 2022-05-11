//java reverse string program
//can also be in palindrome strings
import java.util.Scanner;

public class seventhMayQ1 {
    public static void main(String[] args) {

        //Prompt user to enter a string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String Word = input.next();

        System.out.println("The reversed word of " + Word + " is " + reverse(Word));



    }

    public static String reverse(String Word){
        if (Word.length()==0){
            return "Input a word";
        }
        String reversed="";

        for (int i=Word.length()-1; i>=0; i--){
            reversed= reversed + Word.charAt(i);
        }
        return reversed;
    }
}
