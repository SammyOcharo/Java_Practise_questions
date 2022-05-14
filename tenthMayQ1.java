import java.util.Scanner;

//write a java program for Automorphic numbers (square numbers end with the same number eg. 25 and 5)
public class tenthMayQ1 {
    public static void main(String[] args) {
        System.out.println("Input the number: ");
    int number = new Scanner(System.in).nextInt();
        System.out.println("The number: "+ number + " is: " + Automorphic(number));
    }
    public static String Automorphic(int number){
        int square=number*number;

        while(number>0){
            if(number%10 != square %10){
                return "It is an Automorphic number";


            }
            number = number/10;
            square = square/10;
        }
        return "It is an Automorphic number";
    }

}
