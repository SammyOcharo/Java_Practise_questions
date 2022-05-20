//java program to find the frequency of odd and even numbers in a given matrix
public class May20thQ1 {
    public static void main(String[] args) {

        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int odd = 0;
        int even = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {

                if (matrix[i][j]%2==0){
                    even = even+1;
                }else {
                    odd= odd + 1;
                }
            }
        }
        System.out.println("The frequency of even numbers is: " + even);
        System.out.println("The frequency of odd numbers is: " + odd);
    }
}
