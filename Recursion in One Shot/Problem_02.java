// Print number from 1  to 5:


public class Problem_02 {
    public static void printNum(int n){
        if(n == 6){
            return;
        }
        System.out.println(n+" ");
        printNum(n+1);
    }
    public static void main(String[] args){
        printNum(1);
    }
}
