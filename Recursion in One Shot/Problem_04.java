
// Print Factorial of a number n.

// import java.util.*;
public class Problem_04 {


    public static int calFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int num = calFactorial(n-1);
        int fact = n * num;
        return fact;
    }
    public static void main(String[] args){
        System.out.println("Factorial of number : "+calFactorial(5));
        
    }


    // public static void printFactorial(int i,int n,int fact){
    //     if(i == n){
    //         fact*=i;
    //         System.out.println("Factorial of number "+ n+" : "+fact);
    //         return;
    //     }
    //     fact*=i;
    //     printFactorial(i+1, n, fact);

    // }
    // public static void main(String[] agrs){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter number to print Factorial :");
    //     int n =  sc.nextInt();
    //     printFactorial(1, n, 1);
    //     sc.close();
    // }
}
