import java.util.Scanner;

//write a program to show if a number is a tech number (if you separate the digits at the middle
// add them and square them you should get the number back)
public class May2ndQ2 {
    public static void main(String[] args) {
        System.out.print("Enter number to check weather its a tech number: ");
        int number = new Scanner(System.in).nextInt();

        if (Tech(number)){
            System.out.println("The number "+ number+" is a Tech number");
        } else {
            System.out.println("The number "+number+" is not a Tech number");
        }

    }

    public static boolean Tech(int number){
        int digits = 0;
        int n = number;

        while(n >0){
            digits++;
            n=n/10;

        }
        if(digits%2==0){
            n=number;
            int firstDigits;
            int secondDigits ;
            int squareNumbers = 0 ;
            firstDigits = n % (int) Math.pow(10, digits/2);
            secondDigits = n / (int) Math.pow(10, digits/2);

            //calculate the square
            squareNumbers = (firstDigits+secondDigits)*(firstDigits+secondDigits);

            if (n==squareNumbers){
                return  true;
            }
        }
        return false;
    }
}
