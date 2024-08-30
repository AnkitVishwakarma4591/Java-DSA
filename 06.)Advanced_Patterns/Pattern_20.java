// Print this patter
// P
// Py
// Pyt
// Pyth
// Pytho
// Python
// Python
// Pytho
// Pyth
// Pyt
// Py
// P

public class Pattern_20 {
    public static void main(String[] args){
        String name[] = {"P","y","t","h","o","n"};
        for(int i=0;i<name.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(name[j]);
            }
            System.out.println();
        }
        for(int i=name.length;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(name[j]);
            }
            System.out.println();
        }
    }
}
