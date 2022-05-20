import java.util.Scanner;

//Java program to find the sum of each row and each column of a matrix
public class May20thQ2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of rows: ");
        int rows = in.nextInt();

        System.out.print("Input the number of columns: ");
        int columns = in.nextInt();

        int [][] matrix1 = new int[rows][columns];

        System.out.println("Input the matrix values and press enter after each input");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.println("The input matrix is ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

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
