//Write a program to sort an integer array

import java.util.Arrays;

public class May6thQ1 {
    public static void main(String args[]) {
        //testing our bubble sort method in Java
        int[] unsorted = {32, 39,21, 45, 23, 3};
        bubbleSort(unsorted);

        //one more testing of our bubble sort code logic in Java
        int[] test = { 5, 3, 2, 1};
        bubbleSort(test);

        //one more testing of our bubble sort code logic in Java
        int[] test2 = { 5, 3, 2, 1, 2, 7, 9, 8 ,10};
        bubbleSort(test2);
    }


    public static void bubbleSort(int[] unsorted){
        System.out.println("The unsorted array is" + Arrays.toString(unsorted));

        for (int i=0; i<unsorted.length-1; i++){
            for (int j=1; j< unsorted.length-i; j++){
                if (unsorted[j-1] > unsorted[j]){
                    int temp = unsorted[j];
                    unsorted[j]=unsorted[j-1];
                    unsorted[j-1]=temp;
                }

            }
            System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(unsorted));
        }


    }

}
