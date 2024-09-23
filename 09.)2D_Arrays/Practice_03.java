//  For a given matrix of NxM , print its transpose.

import java.util.Scanner;

public class Practice_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row :");
        int row = sc.nextInt();
        System.out.print("Enter col :");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println("Enter elements in Matrix :");
        for(int i=0 ; i<row ; i++){
            for(int j=0; j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix :");
        for(int i=0 ; i<row ; i++){
            for(int j=0; j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix :");
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
