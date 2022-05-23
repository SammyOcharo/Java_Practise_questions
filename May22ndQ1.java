import java.util.Scanner;

//java program to count the total number of characters in a string
public class May22ndQ1 {
    public static void main(String[] args) {
        System.out.print("Enter the name to count its characters: ");
        String name = new Scanner(System.in).nextLine();

        int count = 0;
        for (int i = 0; i < name.length() ; i++) {
            count++;
        }
        System.out.println("The name " + " has " + count + " characters");
    }
}
