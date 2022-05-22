import java.util.Scanner;

//product of a matrix
public class May21thQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number of rows: ");

        int rows = in.nextInt();
        System.out.print("Input the number of columns: ");
        int columns = in.nextInt();

        int [][] matrix1 = new int[rows][columns];

        System.out.print("Input the elements of the First Matrix: ");

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

        //Inputting the second matrix
        Scanner input2 = new Scanner(System.in);

        System.out.print("Input the number of rows of the second matrix: ");

        int rows2 = input2.nextInt();
        System.out.print("Input the number of columns of the second column: ");
        int columns2 = input2.nextInt();

        int [][] matrix2 = new int[rows2][columns2];

        System.out.print("Input the elements of the Second Matrix: ");

        for (int i = 0; i < rows2 ; i++) {
            for (int j = 0; j < columns2 ; j++) {
                matrix2[i][j] = input2.nextInt();
            }
        }
        System.out.println("The second matrix is ");

        for (int i = 0; i < rows2 ; i++) {
            for (int j = 0; j < columns2 ; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        //check weather the matrix are of the same size
        if(columns != rows2){
            System.out.println("The matrices are not of the same size so cannot be multiplied.");
        }else {
            //compute the product of the matrix and output
            int [][]multipliedMatrix = new int[rows][columns2];

            for (int i = 0; i < rows ; i++) {
                for (int j = 0; j < columns2 ; j++) {
                    for (int k = 0; k < rows2 ; k++) {
                        multipliedMatrix[i][j] = multipliedMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("The product of the matrix1 and matrix2 is: ");
            for (int i = 0; i < rows ; i++) {
                for (int j = 0; j < columns2 ; j++) {
                    System.out.print(multipliedMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
