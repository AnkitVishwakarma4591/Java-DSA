// Take an array of numbers as input and check if it is an array sorted in
//  ascending order.
//  Eg:{1,2,4,7} is sorted in ascending order.
//      {3,4,6,2}is not  sorted in  ascending order.// 


import java.util.*;
public class Practice_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array :");
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter element "+(i+1)+" :");
            number[i] = sc.nextInt();
        }
        boolean isAsscending = true;
        for(int i=0;i<size-1;i++){
            if(number[i] > number[i+1]){
                isAsscending = false; 
            }
        }
        if(isAsscending){
            System.err.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order");
        }
        sc.close();
    }
}
