import java.util.Scanner;

//java program to find the subset of a string
public class May24thQ2 {
    public static void main(String[] args) {
        System.out.print("Input the String ");
        String input = new Scanner(System.in).nextLine();

        for (int i = 0; i < input.length() ; i++) {
            for (int j = 0; j < input.length() ; j++) {
                System.out.print(input.charAt(i) + " ");
                System.out.print(input.charAt(i) + " " + input.charAt(j));
                System.out.println(input + " ");
            }
        }
    }
}
