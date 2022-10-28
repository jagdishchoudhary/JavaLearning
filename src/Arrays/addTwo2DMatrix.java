package Arrays;

public class addTwo2DMatrix {
    public static void main(String[] args) {
        int mat1[][] = {{1, 2, 3}, {3, 5, 6}, {0, 1, 3}};
        int mat2[][] = {{8, 6, 0}, {1, 2, 8}, {2, 6, 8}};


        printMatrix(mat1);
        System.out.println();
        printMatrix(mat2);
        System.out.println();


        int[][] sum = sumOfMatrix(mat1, mat2);
        printMatrix(sum);
    }

    private static int[][] sumOfMatrix(int[][] mat1, int[][] mat2) {


        int rowsInMat1 = mat1.length;
        int columnsInMat1 = mat1[0].length;

        int rowsInMat2 = mat2.length;
        int columnsInMat2 = mat2[0].length;

        int[][] mat3 = new int[rowsInMat1][columnsInMat1];
        if(rowsInMat1 != rowsInMat2 || columnsInMat1 != columnsInMat2){
            System.out.println("Not equalvence matrix");
        }

        for(int i = 0; i < rowsInMat1; i++){
            for(int j = 0; j < columnsInMat1; j++)
                mat3[i][j] = mat1[i][j] + mat2[i][j];
        }
        return mat3;
    }

    private static void printMatrix(int[][] mat1) {
        int rows = mat1.length;
        int columns = mat1[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++)
                System.out.print(mat1[i][j] + " ");

            System.out.println();
        }

    }
}
