// Print your name using Function.
import java.util.*;

public class Practice_01 {
    public static void printName(String name){
        System.out.println("your Name is :"+name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        printName(name);
        sc.close();
    }
}
