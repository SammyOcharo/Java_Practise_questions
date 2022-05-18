import java.util.Arrays;

//java program to find the smallest element in an array
public class May18thQ1 {
    public static void main(String[] args) {
        int [] arr = new int[]{45,54,23,78,54,24,14,65,89};

        System.out.println("The array is "+ Arrays.toString(arr));

        System.out.print("The smallest element of the array is "+ smallestElement(arr));
    }

    static  int smallestElement(int[] arr){

        int temp=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        int smallestElement;
        smallestElement = arr[0];
        return smallestElement;
    }
}
