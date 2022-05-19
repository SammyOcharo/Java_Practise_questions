//java program to view the lower triangular matrix
public class May19thQ2 {
    public static void main(String[] args) {

        int [][] matrix1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int row, col;

        row = matrix1.length;
        col = matrix1[0].length;

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if (j>i){
                    System.out.print("0 ");
                }else {
                    System.out.print(matrix1[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

}
