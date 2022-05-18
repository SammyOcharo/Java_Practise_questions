import java.util.Arrays;

//java program to find the 2nd smallest number in an array
public class May5thQ1 {
    public static void main(String[] args) {
        int [] arr = new int[] {52,45,69,54,74,36,21,23,29};

        System.out.println("The array is "+ Arrays.toString(arr));

        System.out.println("The 2nd smallest number in the array is " + secondSmallest(arr));
    }

    static int secondSmallest(int [] arr){

        int temp = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
            }
        }
        int secondSmallestNumber;
        secondSmallestNumber = arr[1];
        return secondSmallestNumber;
    }

}
