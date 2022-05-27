//Removing the whitespaces from a string
public class May26thQ1 {
    public static void main(String[] args) {
        String str1 = "Remove white space";

        str1 = str1.replaceAll("\\s+", "");

        System.out.println(str1);
    }
}
