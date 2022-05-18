import java.util.Arrays;

//java program to print elements of an array present on odd position
public class May18thQ2 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,5,2,6,7,8,5,14,25,19};

        System.out.println("The array is "+ Arrays.toString(arr));

        System.out.println("The elements that appear on odd position are: " );
        OddPosition(arr);
    }

    static void OddPosition(int[] arr){
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }

    }
}
