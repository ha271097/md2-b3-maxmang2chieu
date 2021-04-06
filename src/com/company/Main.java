package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size and element of the matrix");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int array[][] = addArray(row,column,sc);
        int maximun = findMax(array);
        System.out.println("Max of matrix is : " + maximun);
    }
    public static int[][] addArray(int row, int column, Scanner sc){
        int matrix [][] = new int[row][column];
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter element x = " + i + " y = " + j );
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
        }
        public static int findMax(int matrix[][]){
        int max = matrix[0][0];
        int x = 0;
        int y = 0;
            for (int i = 0 ; i < matrix.length ; i++) {
                for (int j = 0 ; j < matrix[i].length ; j++) {
                    if(matrix[i][j] > max){
                        max = matrix[i][j];
                        x = i;
                        y = j;
                    }

                }
            }
            System.out.println("this x = " + x + "; y = " + y + " : " );
            return max;
        }


}
