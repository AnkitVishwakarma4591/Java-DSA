// Searching for an element x in a matrix.

import java.util.*;
public class Practice_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row & col : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];

        System.out.println("Enter elements in matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number that u want to find: ");
        int x = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == x){
                    System.out.println("Found at ("+ i+","+j+")");
                }
            }
        }
        sc.close();
    }
}
