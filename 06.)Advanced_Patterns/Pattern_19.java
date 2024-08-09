//  Print Inverted Half Pyramid.
// 1111
// 222
// 33
// 4


public class Pattern_19 {
    public static void main(String[] args){
        int n=4;
        int num=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++ ){
                System.out.print(num);
            }
            System.out.println();
            num++;
        }
    }
}
