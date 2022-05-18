import java.util.Arrays;

//java program to output array elements in descending order
public class May11thQ2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,5,4,9,7,8,6};

        System.out.println("The array before sorting in descending order "+ Arrays.toString(arr));

        System.out.println("The array after sorting in descending order "+ ArrayDescending(arr));
    }

     static String ArrayDescending(int[] arr){

        int temp=0;
         for (int i = 0; i < arr.length ; i++) {
             for (int j = 0; j < arr.length ; j++) {
                 if (arr[i]<arr[j]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
         return Arrays.toString(arr);
     }
}
