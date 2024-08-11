// Calculate Product of two number using function.


import java.util.*;
public class Practice_03 {
    public static float calculateProduct(int a, int b){
        float product = a*b;
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        float product = calculateProduct(a, b);
        System.out.println("Product of two number :" + product);

        sc.close();
    }
}
