// Take an input from user and print hte array;


import java.util.*;
public class Practice_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i=0 ; i<size ; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Array : ");
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
        sc.close();
    }
}
