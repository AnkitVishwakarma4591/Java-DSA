//  Find the maximum & minimum number in an array of integers.

import java.util.*;
public class Practice_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i=0;i<number.length;i++){
            number[i] = sc.nextInt();
        }
        int min = number[0];
        int max = number[0];
        for(int i=0;i<number.length;i++){
            if(number[i] < min){
                min = number[i];
            }else if(number[i] > max){
                max = number[i];
            }
        }
        System.out.println("Smallest number is :"+min);
        System.out.println("Largest number is :"+max);
        
        sc.close();
    }
}
