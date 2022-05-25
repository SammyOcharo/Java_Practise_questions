//java program to divide a string to two equal parts
public class May24thQ1 {
    public static void main(String[] args) {
        String string  = "departmentse";

        int count = 0;
        int totalCount = string.length();
        int halfCount  = totalCount/2;
        for (int i = 0; i < string.length() ; i++) {
            System.out.print(string.charAt(i) + " ");
            totalCount--;
            if (totalCount == halfCount){
                break;
            }
        }

    }
}
