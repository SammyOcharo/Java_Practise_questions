import java.util.Arrays;

//write a code to sort an array in java in descending order
public class May3rdQ2 {
    public static void main(String[] args) {


        int [] array = new int[]{52,45,63,47,21,25,65,48};
        System.out.println("The array before sorting");

        System.out.println(Arrays.toString(array));
        System.out.println("The array after sorting");
        System.out.println(sortingArray(array));
    }
    static String sortingArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i]>array[j]){
                    int temp = 0;
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }
            }
        }
        return Arrays.toString(array);
    }
}
