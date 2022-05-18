//java program to find the frequency of each element in an array
public class May4thQ2 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,8,3,2,2,2,5,1};

        int [] frequency = new int[arr.length];

        int visited = -1;
        for (int i = 0; i < arr.length ; i++) {
            int count = 1;

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                    //To avoid counting the same element again
                    frequency[j] = visited;
                }

            }
            if (frequency[i] != visited) {
                frequency[i] = count;
            }
        }
        // Displaying each element alongside its frequency of appearance
        System.out.println("-----------------------------");
        System.out.println("Element | Frequency");
        System.out.println("-----------------------------");

        for (int i = 0; i < frequency.length ; i++) {
            if (frequency[i] != visited){
                System.out.println("      "+ arr[i] + " |       "+ frequency[i]);
            }
        }
        System.out.println("-----------------------------");
    }
}