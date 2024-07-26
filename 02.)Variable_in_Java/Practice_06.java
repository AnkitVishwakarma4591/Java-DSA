// 1. Try to declare meaningful variables of each type. Eg- a variable
// named age should be a numeric type(int or float) not byte.

import java.util.*;
public class Practice_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name :");
        String name = sc.nextLine();

        System.out.print("Enter your age :");
        int age = sc.nextInt();

        System.out.print("Enter CGPA :");
        Float cgpa = sc.nextFloat();

        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("CGPA :" + cgpa);

        sc.close();
    }
}
