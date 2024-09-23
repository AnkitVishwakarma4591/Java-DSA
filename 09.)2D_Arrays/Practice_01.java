// 2D Array taking input as elemnet of matrix printing them
import java.util.*;
public class Practice_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
