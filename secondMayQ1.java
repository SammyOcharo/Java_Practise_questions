import java.util.Scanner;

//make a java program to determine sunny numbers(this re numbers when you add 1 to it makes the number a square number)
public class secondMayQ1 {
    public static void main(String[] args) {
        System.out.print("Input number to check weather it is a sunny number: ");
        int number = new Scanner(System.in).nextInt();

        if (Sunny(number)){
            System.out.println("the number "+ number + " is a sunny number");
        } else {
            System.out.println("the number "+ number + " is not a sunny number");
        }

    }

    public static boolean Sunny(int number){
        int determiner = number + 1;
        double Squareroot =  Math.sqrt(determiner);
        if(Squareroot-Math.floor(Squareroot)==0){
            return true;
        }
        return false;
    }
}
