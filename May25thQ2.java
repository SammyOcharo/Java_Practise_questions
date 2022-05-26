//java program to output all the permutations of a string
public class May25thQ2 {
    public static void main(String[] args) {

        String str = "ABC";

        int len = str.length();

        System.out.println("All the permutations of the string are: ");

        generatePermutations(str, 0, len);

    }
    
    static String swapString(String a, int i, int j){
        char[] b = a.toCharArray();
        char ch;

        ch=b[i];
        b[i]=b[j];
        b[j]=ch;

        return String.valueOf(b);
    }
    //function to output different permutations.
    static void generatePermutations(String str, int start, int end){
        if (start==end-1){
            System.out.println(str);
        }else {
            for (int i = start; i < end ; i++) {
                //swaping a character by fixing a character
                str = swapString(str, start, i);

                //recursively calling the function

                generatePermutations(str, start+1, end);

                str = swapString(str, start, i);
            }
        }
    }
}
