import java.util.Scanner;

//write a java program to find GCD of two numbers
public class ninthMayQ1 {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        int input1 = new Scanner(System.in).nextInt();

        System.out.println("Enter the second number");
        int input2 = new Scanner(System.in).nextInt();

        System.out.println("The GCD of "+ input1 +" and " + input2 + " is: " + GCD(input1,input2));


    }

    public static int GCD(int input1, int input2){
        int divisors=1;
        for (int i = 1; i < input1 && i<=input2; i++) {
            if(input1%i==0 && input2%i==0){
                divisors=i;
            }

        }
        return divisors;
    }
}
