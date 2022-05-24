//java program to find the number of vowels and consonants in a string
public class May23rdQ1 {
    public static void main(String[] args) {
        String sentence = "This is a sentence";
        int vowels=0;
        int consonants = 0;

        for (int i = 0; i < sentence.length() ; i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' ||sentence.charAt(i) == 'u'){
                vowels++;

            } else if (sentence.charAt(i) == ' ') {
                continue;
            }else {
                consonants++;
            }
        }
        System.out.println("Number of vowels is " + vowels);
        System.out.println("Number of consonants is " + consonants);
    }

}
