import java.util.Arrays;

//java program to copy all elements of an array to another array
public class May4thQ1 {
    public static void main(String[] args) {
        int [] mainArray =new int [] {2,3,4,8,5,7,6,45,85,98,41};


        System.out.println("The Original Array is "+ Arrays.toString(mainArray));
        System.out.println("The Original Array is "+ CopiedArray(mainArray));
    }

    static String CopiedArray(int[] mainArray){
        int [] copiedArray = new int[mainArray.length];
        for (int i = 0; i < copiedArray.length ; i++) {
            copiedArray[i] = mainArray[i];
        }
        return Arrays.toString(copiedArray);
    }
}
