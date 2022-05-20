//Java program to find the sum of each row and each column of a matrix
public class May20thQ2 {
    public static void main(String[] args) {
        int [][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int row1 = matrix1.length;
        int col1 = matrix1[0].length;

        for (int i = 0; i < row1 ; i++) {
            int rowSum = 0;
            for (int j = 0; j < col1 ; j++) {
                rowSum = rowSum + matrix1[i][j];
            }
            System.out.println("The sum of row "+ (i+1) + " is "+ rowSum );
        }

        System.out.println();
        for (int i = 0; i < col1 ; i++) {
            int colSum = 0;
            for (int j = 0; j < row1 ; j++) {
                colSum = colSum + matrix1[j][i];
            }
            System.out.println("The sum of col " + (i+1) +" is " + colSum);
        }
    }
}
