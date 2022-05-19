//java program to determine weather two matrices are equal
public class May19thQ1 {
    public static void main(String[] args) {
        int [][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};

        int [][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};

        boolean flag = true;
        int row1, row2, col1, col2 ;

        row1 = matrix1.length;

        row2 = matrix2.length;
        col1 = matrix1[0].length;
        col2 = matrix2[0].length;

        // check weather the dimensions of the matrix are equal
        if(row1!=row2 && col1!=col2){
            System.out.println("The matrices are not the same");
        }else {
            for (int i = 0; i < row1 ; i++) {
                for (int j = 0; j < col1 ; j++) {

                    if (matrix1[i][j] != matrix2[i][j]){
                        flag=false;
                        break;
                    }
                }
            }
            if (flag){
                System.out.println("The matrices are same");
            } else {
                System.out.println("The matrices are not the same");
            }
        }

    }
}
