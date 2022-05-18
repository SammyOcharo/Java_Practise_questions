import java.util.Arrays;

//java program to print even numbers in an array
public class May13thQ1 {
    public static void main(String[] args) {
        int [] arr = new int[]{12,52,41,65,79,84,51,10};

        System.out.println("The array is " + Arrays.toString(arr));
        System.out.print("The even numbers of the array are ");
        evenNumbers(arr);

    }
    static void evenNumbers(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==0){
                System.out.print(arr[i] + ",");
            }
        }
    }
}
