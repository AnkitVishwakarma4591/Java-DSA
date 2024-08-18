// Write a function that takes in the radius as input and returns the
//  circumference of a circle.

import java.util.*;

public class Question_04 {
    public static double calculateArea(float r){
        double area = Math.PI*r*r;
        return area;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle :");
        float a = sc.nextFloat();

        System.out.println("Area of Circle :"+calculateArea(a));;

        sc.close();
    }
}
