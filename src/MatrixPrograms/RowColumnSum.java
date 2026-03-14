package MatrixPrograms;

public class RowColumnSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Row Sums
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
        }

        // Column Sums
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of Col " + (j + 1) + ": " + colSum);
        }
    }
}
