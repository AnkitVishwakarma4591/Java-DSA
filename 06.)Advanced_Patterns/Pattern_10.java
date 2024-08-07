// print the pattern        Butterfly Pattern
// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * * 
// * * * * * * * * 
// * * *     * * * 
// * *         * * 
// *             * 

public class Pattern_10 {
    public static void main(String[] args){
        int n=4;
        // // Uppar part
        // for(int i=1; i<=n; i++){
        //     // 1st part star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     // 1st part space
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     // 2nd part space
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     // 2nd part star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // // lower part
        // for(int i=n; i>=1; i--){
        //     // 1st part star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     // 1st part space
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     // 2nd part space
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     // 2nd part star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }


        // Uppar part
        for(int i=1; i<=n; i++){
            // uppar left part star
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            // uppar part space
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){
                System.out.print("  ");
            }
            // uppar right part star
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        // lower part
        for(int i=n; i>=1; i--){
            // lower left part star
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            // lower part space
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){
                System.out.print("  ");
            }
            // lower right part star
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
