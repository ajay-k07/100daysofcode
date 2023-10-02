import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        setZeroesWithFilled(matrix);
    }

    public static void setZeroesWithFilled(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && visited[i][j] != true) {
                    // Setting the row Zero
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (matrix[i][k] == 0 && visited[i][k] != true) {
                            visited[i][k] = false;
                        } else {
                            visited[i][k] = true;
                        }
                        matrix[i][k] = 0;

                    }
                    // Setting the column zero
                    for (int c = 0; c < matrix.length; c++) {
                        if (matrix[c][j] == 0 && visited[c][j] != true) {
                            visited[c][j] = false;
                        } else {
                            visited[c][j] = true;
                        }
                        matrix[c][j] = 0;

                    }
                }
            }
        }
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void setZeroes(int[][] matrix) {
        class Index {
            int row;
            int column;

            public Index(int row, int column) {
                this.row = row;
                this.column = column;
            }
        }
        ArrayList<Index> arrayList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        arrayList.add(new Index(i, j));
                    }
                }
            }
        }
        for (Index i : arrayList) {
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[i.row][k] = 0;
            }

            for (int k = 0; k < matrix.length; k++) {
                matrix[k][i.column] = 0;
            }
        }
    }
}
