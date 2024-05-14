
public class Matrix {

    private int[][] arr;

    public Matrix(int rows, int cols) {
        this.arr = new int[rows][cols];
    }

    public Matrix addtionMatrix(Matrix matrix) throws Exception {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows != matrix.arr.length || cols != matrix.arr[0].length) {
            throw new Exception("Two matrices have different size");
        }

        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.arr[i][j] = arr[i][j] + matrix.arr[i][j];
            }
        }
        return result;
    }

    public Matrix subtractionMatrix(Matrix matrix) throws Exception {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows != matrix.arr.length || cols != matrix.arr[0].length) {
            throw new Exception("Two matrices have different size");
        }

        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.arr[i][j] = arr[i][j] - matrix.arr[i][j];
            }
        }
        return result;
    }

    public Matrix multiplicationMatrix(Matrix matrix) throws Exception {
        int row1 = arr.length;
        int col1 = arr[0].length;
        int row2 = matrix.arr.length;
        int col2 = matrix.arr[0].length;

        if (col1 != row2) {
            throw new Exception("Cannot multiply matrices");
        }

        Matrix result = new Matrix(row1, col2);

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result.arr[i][j] += arr[i][k] * matrix.arr[k][j];
                }
            }
        }
        return result;
    }

    public void inputMatrix() throws Exception {
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Enter the values of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "] = ");
                arr[i][j] = CheckInput.checkInt();
            }
        }
    }

    public void printMatrix() {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + arr[i][j] + "]");
            }
            System.out.println();
        }
    }

}
