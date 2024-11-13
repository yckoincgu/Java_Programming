package midterm1113;

public class j4 {
    public static void main(String[] args) {
        //2*2matrixes
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {3, 4},
            {5, 6}
        };

        int[][] resultMatrix = new int[2][2];

        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < 2; k++) { 
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resulted Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%4d", resultMatrix[i][j]); 
            }
            System.out.println(); 
        }
    }
}
