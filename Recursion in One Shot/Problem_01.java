
// Print number from 5 to 1:
public class Problem_01 {

    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
        
    }
    public static void main(String[] args){
        printNum(5);
    }
}
