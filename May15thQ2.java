//java program to determine weather a matrix is an identity matrix
//a matrix is said to be an identity matrix if it is a square matrix in which
//elements of principle diagonal are ones and the rest elements are zeros
public class May15thQ2 {
    public static void main(String[] args) {

        int[][] identityMatrix = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int rows = identityMatrix.length;
        int columns = identityMatrix[0].length;
        boolean flag = true;

        if(rows != columns){
            System.out.println("The matrix is not a square matrix");
        }else {
            for (int i = 0; i < rows ; i++) {
                for (int j = 0; j < columns ; j++) {
                    if(i==j && identityMatrix[i][j] != 1){
                        flag = false;
                        break;
                    }
                    if(i != j && identityMatrix[i][j] != 0){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("The matrix is an identity matrix");
            } else {
                System.out.println(" The matrix is not an identity matrix");
            }
        }

    }
}
