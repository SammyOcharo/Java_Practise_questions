import java.util.Arrays;

//java program to find 3rd largest element in an array
public class May17thQ2 {
    public static void main(String[] args) {
        int [] arr = new int[] {25,74,596,74,25,145,41,74};
        System.out.println("The original array is "+ Arrays.toString(arr));

        System.out.print("The third largest element in the array is " + ThirdLargestElement(arr));
    }

    static int ThirdLargestElement(int[]arr){

        int temp = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]<arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;

                }
            }
        }
        int thirdLargestElement;
        thirdLargestElement = arr[2];
        return thirdLargestElement;
    }

}
