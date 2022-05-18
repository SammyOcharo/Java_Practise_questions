import java.util.Arrays;

//java code to find the second largest number in an array
public class May17thQ1 {
    public static void main(String[] args) {
        int [] arr = new int[]{25,85,65,45,23,74,65};

        System.out.println("The original array is "+ Arrays.toString(arr));

        System.out.print("The second largest number is "+ SecondLargest(arr));
    }

    static int SecondLargest(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int secondLargestNumber;
        secondLargestNumber = arr[1];
        return secondLargestNumber;
    }
}
