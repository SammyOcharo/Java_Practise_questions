//program to determine weather the matrix is a sparse matrix
//sparse matrix is a matrix with less non-zero elements as zero elements
public class May21thQ1 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {0,5,6},
                {0,0,9}
        };

        int row, column, totalCount;
        int count = 0;
        row = matrix.length;
        column = matrix[0].length;

        totalCount = row*column;

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column ; j++) {
                if (matrix[i][j] == 0){
                    count++;
                }
            }
        }
        if(count>totalCount/2){
            System.out.println("The Matrix is a sparse matrix");
        } else {
            System.out.println("The Matrix is not a sparse matrix");
        }
    }
}
