import java.util.Scanner;

//check weather the string is a palindrome
public class May28thQ2 {
    public static void main(String[] args) {
        System.out.println("Enter a word to check if its a palindrome");
        String word = new Scanner(System.in).nextLine();

        //change to lowercase
        String Word = word.toLowerCase();
        boolean flag = true;

        //Iterate the word both from the beginning and from the end to check weather the characters are the same

        for (int i = 0; i < Word.length()/2 ; i++) {
            if (Word.charAt(i) != Word.charAt(Word.length()-i-1)){

                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("The word is a palindrome");
        }else {
            System.out.println("The word is not a palindrome");
        }

    }
}
