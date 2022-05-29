//Check weather one string is a rotation of the other
public class May27thQ2 {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";

        if (str1.length() != str2.length()){
            System.out.println("Second string is not a rotation of the 1st string");

        }else {
            //concatenate
            str1 = str1.concat(str1);

            //check weather String 2 is in string 1
            if (str1.indexOf(str2) !=-1){
                System.out.println("The string is a rotation of string 1");
            }else {
                System.out.println("The string is not a rotation of string 1");
            }
        }
    }
}
