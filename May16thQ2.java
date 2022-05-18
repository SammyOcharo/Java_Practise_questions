//java program to print the duplicate elements of an array
public class May16thQ2 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,1,2,3,4,2,4,5};

        System.out.println("The duplicated elements are: ");
        for (int i = 0; i < arr.length ; i++) {
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.print(arr[j] + ",");
                }
            }
        }
    }
}
