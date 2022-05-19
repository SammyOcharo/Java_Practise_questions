//java program to multiply two matrices
public class May14thQ2 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};

        int [][] product = new int[3][3];

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                product[i][j] = matrix1[i][j]*matrix2[i][j];
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
