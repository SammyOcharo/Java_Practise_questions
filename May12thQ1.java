import java.util.Arrays;

//java program to print the sum of all items in an array
public class May12thQ1 {
    public static void main(String[] args) {
        int [] array = new int[]{1,5,2,4,5,8,4,5,6,4,5,7};

        System.out.println("The array elements are "+ Arrays.toString(array));

        System.out.println("The sum of array elements is "+ arrayAddition(array));
    }
    static int arrayAddition(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
