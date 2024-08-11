// Print Pascal’s Triangle.
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

public class Pattern_17 {
    public static void main(String[] args){
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
