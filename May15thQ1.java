import java.util.Scanner;

//java program to find a transpose of a matrix
public class May15thQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of rows of your matrix: ");

        int rows = input.nextInt();
        System.out.print("Input the number of columns of your matrix: ");

        int columns = input.nextInt();
        int [][] matrix = new int[rows][columns];

        System.out.println("Input the values and press enter after each element: ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The matrix input is:");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int [][] transposeMatrix = new int[columns][rows];
        //changing the rows of matrix into columns in transpose matrix
        for (int i = 0; i < columns ; i++) {
            for (int j = 0; j < rows ; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        //outputting the transpose matrix
        System.out.println("The transpose of matrix entered is");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
