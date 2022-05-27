//replace lowercase characters to uppercase characters and vice versa
public class May26thQ2 {
    public static void main(String[] args) {
        String  string = "Please Come";
        StringBuffer newStr = new StringBuffer(string);

        for (int i = 0; i < string.length() ; i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(string.charAt(i)));
            }
            //check if the character is uppercase and change it to lower case

            else if (Character.isUpperCase(string.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(string.charAt(i)));
            }
        }
        System.out.println(newStr);
    }
}
