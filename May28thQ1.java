import java.util.Scanner;

//Java program to find maximum and minimum occurring character in a string
public class May28thQ1 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String Word= new Scanner(System.in).nextLine();

        int [] freq = new int[Word.length()];

        char minChar = Word.charAt(0);
        char maxChar = Word.charAt(0);



        //covert the string into a character array

        char string[] = Word.toCharArray();

        //loop through each character, count the frequency and store in an array
        for (int i = 0; i < string.length ; i++) {
            freq[i]=1;
            for (int j = i+1; j < string.length ; j++) {
                if (string[i]==string[j]&& string[i] != ' ' && string[i] !='0'){
                    freq[i]++;

                    string[j]='0';
                }
            }
        }
        //Determine the minimum and maximum occurring characters
        int min=freq[0];
        int max=freq[0];
        for (int i = 0; i < freq.length ; i++) {
            if (min>freq[i] && freq[i] !='0'){
                min = freq[i];
                minChar = string[i];
            }
            if (max<freq[i] && freq[i] !='0'){
                max = freq[i];
                maxChar = string[i];
            }
        }
        System.out.println("The maximum occurring character is "+ maxChar);
        System.out.println("The minimum occurring character is "+ minChar);

    }
}
