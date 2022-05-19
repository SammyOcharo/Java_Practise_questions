//java program to add two matrices
public class May14thQ1 {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = {{1,2,3},{4,5,6},{7,8,9}};

        int [][] sum = new int[3][3];

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                sum[i][j] = a[i][j]+b[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
