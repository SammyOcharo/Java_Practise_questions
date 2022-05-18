//10. Print following structure in Java?
//*
//***
//*****
//***
//*

public class May8thQ2 {
    public static void main(String[] args) {
        structure();
        structure1();

    }

    public static void structure(){
        int number =0;
        while(number <=4){
            if(number % 2 !=0){
                if (number==1){
                    System.out.print("*".repeat(number) );
                    System.out.println();
                }
                if (number==3){
                    System.out.print("*".repeat(number) );
                    System.out.println();
                }
                if (number==5){
                    System.out.print("*".repeat(number) );
                    System.out.println();
                }
            }
            number++;
        }
    }
    public static void structure1(){
        int number =6;
        while(number >0){
            if(number % 2 !=0){
                if (number==1){
                    System.out.print("*".repeat(number) );
                    System.out.println();
                }
                if (number==3){
                    System.out.print("*".repeat(number) );
                    System.out.println();
                }
                if (number==5){
                    System.out.print("*".repeat(number) );
                    System.out.println();
                }
            }
            number--;
        }
    }
}
