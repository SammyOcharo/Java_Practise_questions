import java.util.Arrays;

//java program to remove duplicate elements in an array
public class May13thQ2 {
    public static void main(String[] args) {

        int [] arr = new int[] {10,10,50,50,20,30,40,30,60};
        System.out.println("The array before removing the duplicate elements " + Arrays.toString(arr));

        System.out.print("The array after removing the duplicates is ");
        removeDuplicates(arr);
    }
    static void removeDuplicates(int[] arr){
        int [] arr2 = new int[9];
        int visited = -1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
              if(arr[i]==arr[j]){
                  arr[j] = visited;
              }
            }

        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] !=visited){
                System.out.print(arr[i]+ ",");
            }
        }
    }
}
