//counting the number of punctuations in a string
public class May22ndQ2 {
    public static void main(String[] args) {
        String sentence = "He said, 'The mailMan loves you.' I heard it with my own ears.";

        int count = 0;
        for (int i = 0; i < sentence.length() ; i++) {
            //checking for punctuations in the sentence.
            if (sentence.charAt(i) == '!' || sentence.charAt(i) == ',' || sentence.charAt(i) == '.' || sentence.charAt(i) == ';' || sentence.charAt(i) == '?' || sentence.charAt(i) == '\"' || sentence.charAt(i) == '/' ){
                count++;
            }
        }
        System.out.println("The number of punctuations in the sentence is " + count);
    }
}
