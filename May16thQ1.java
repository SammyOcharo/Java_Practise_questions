import java.util.Arrays;

//java program to left rotate elements of an array
public class May16thQ1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        int n=3;
        System.out.println("The original array is "+ Arrays.toString(arr));

        //rotate the given array by n times towards the left
        for (int i = 0; i < n; i++) {
            int j, first;

            // shift the first element of the array
            first=arr[0];

            for (j=0; j<arr.length-1; j++){

                //moves each element to the right
                arr[j] = arr[j+1];

            }
            arr[j] = first;

        }
        System.out.print("Array after rotation [");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.print("]");
    }
}
