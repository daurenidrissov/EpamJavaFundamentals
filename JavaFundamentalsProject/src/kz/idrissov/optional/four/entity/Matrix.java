package kz.idrissov.optional.four.entity;

public class Matrix {
    public double[][] sortbyKthColumn(double[][] matrix, int length, int k) {
        double temp;
        for(int i = 1; i < length; i++) {
            for(int l = i; l > 0; l--) {
                if(matrix[l][k] < matrix[l-1][k]) {
                    for(int j = 0; j < length; j++) {
                        temp = matrix[l][j];
                        matrix[l][j] = matrix[l - 1][j];
                        matrix[l - 1][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public String betweenPositive(double[][] matrix, int length) {
        String s = "";
        for (int i = 0; i < length; i++) {
            double sum = 0.0;
            int a = -1;
            int b = -1;
            for(int j = 0; j < length; j++) {
                if(matrix[i][j] >= 0 && a == -1) {
                    a = j;
                } else if(matrix[i][j] >= 0 && a != -1 && b == -1) {
                    b = j;
                }
            }
            if(a != -1 && b != -1) {
                for(int j = a; j <= b; j++) {
                    sum += matrix[i][j];
                }
                s += i+1 + ". Elements: " + String.format("%.2f", matrix[i][a]) + ", "
                        + String.format("%.2f", matrix[i][b]) + "; Sum: " + String.format("%.2f", sum) + "; \n";
            } else {
                s += i+1 + ". There is no two positive numbers in a row; \n";
            }

        }
        return s;
    }
}
