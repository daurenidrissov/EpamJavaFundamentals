package kz.idrissov.optional.four;

import kz.idrissov.optional.four.entity.Matrix;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Matrix m = new Matrix();
        System.out.print("Enter any positive integer number n: ");
        int n = scan.nextInt();

        System.out.print("Enter any positive integer number M (bound for matrix elements): ");
        int M = scan.nextInt();

        double[][] matrix = new double[n][n];

        Random rand = new Random();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = 2 * M * rand.nextDouble() - M;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println(m.betweenPositive(matrix, n));

        System.out.print("\nEnter a number k in range from 0 to n-1: ");
        int k = scan.nextInt();
        if(k < 0 || k > n-1) {
            throw new   IllegalArgumentException("k is out of range");
        }

        System.out.println("Matrix sorted by Kth column: ");
        m.sortbyKthColumn(matrix, n, k);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
