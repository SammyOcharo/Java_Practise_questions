//java program to determine weather a number is a perfect square


import java.util.Scanner;

public class thirdMayQ1 {
    public static void main(String[] args) {
        System.out.print("Enter the number to check if its a perfect square: ");

        double number = new Scanner(System.in).nextDouble();

        if (PerfectSquare(number)){
            System.out.println(number +" is a perfect square");
        }else {
            System.out.println(number +" is not a perfect square");
        }


    }

    static boolean PerfectSquare(double number){
        for (int i = 0; i*i <= number; i++) {
            if(number%i==0 && number/i==i){
                return true;
            }
        }
        return false;
    }
}
