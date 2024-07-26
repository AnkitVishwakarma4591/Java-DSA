//  2. Make a program that takes the radius of a circle as input,
//  calculates its radius and area and prints it as output to the user


import java.util.*;

public class Practice_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        Float r = sc.nextFloat();
        double area = Math.PI * r *r;
        System.out.println("Area of Circle : " + area);

        sc.close();

    }
}
