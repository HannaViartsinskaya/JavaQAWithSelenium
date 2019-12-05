package com.javaFundamential;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }

    public static int[][] sortMatrix(int[][] matr, int N) {
        for (int i = 0; i < N; i++) {
            for (int l = 0; l < N - 1; l++) {
                if (matr[1][l + 1] < matr[1][l]) {
                    for (int j = 0; j < N; j++) {
                        int temp = matr[j][l];
                        matr[j][l] = matr[j][l + 1];
                        matr[j][l + 1] = temp;
                    }
                }
            }
        }
        return matr;
    }

    public static void main(String[] args) {
        //Задание. Ввести с консоли n - размерность матрицы a [n] [n].
        // Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел
        // (класс Random).
        //1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите размерность матрицы и число M в пределеах которого (M,-M) будут генерироваться случайные числа");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = getRandomNumberInRange(-m, m);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------");
        sortMatrix(matrix, n);
        int[][] matrixNew = new int[n][n];
        matrixNew = sortMatrix(matrix, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixNew[i][j] + " ");
            }
            System.out.println(" ");
        }
//Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
    }
}
