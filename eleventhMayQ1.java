import java.util.Arrays;

//java program to sort array elements in ascending order
public class eleventhMayQ1 {
    public static void main(String[] args) {
        int [] arr = new int[]{5,4,1,3,2,6,7,9,8};

        System.out.println("The array before sorting is " + Arrays.toString(arr));


        System.out.println("The array after sorting is " + SortingArray(arr));

    }

    static String SortingArray(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j< arr.length; j++){

                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        return Arrays.toString(arr);
    }
}
