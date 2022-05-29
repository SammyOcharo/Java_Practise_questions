import java.util.Scanner;

//replace all spaces in a string with "-"
public class May27thQ1 {
    public static void main(String[] args) {
        System.out.println("Enter the word");
        String word = new Scanner(System.in).nextLine();
        
        char ch = '-';

        String newWord = word.replace(' ', ch);

        System.out.println("newWord = " + newWord);
        
        
        
    }
}
