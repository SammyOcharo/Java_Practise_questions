import java.util.Arrays;

//java program to print the smallest element in an array
public class May12thQ2 {
    public static void main(String[] args) {

        int [] arr = new int[]{202,51,392,456,445,879,768,4585,2224,271,258,865};

        System.out.println("The array is "+ Arrays.toString(arr));
        System.out.println("The smallest element is: "+ smallestElement(arr));

    }
    static int smallestElement(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<arr[i+1]){
                return arr[i];
            }
        }
        return 1;
    }
}
