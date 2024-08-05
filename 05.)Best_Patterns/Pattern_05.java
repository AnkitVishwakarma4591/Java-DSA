// print the pattern           inverted half pyramid (rotated by 180')
//             *
//         *   *
//     *   *   *
// *   *   *   *

public class Pattern_05 {
    public static void main(String[] args){
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
