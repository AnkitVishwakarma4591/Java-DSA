// Make a simple program of an Array

public class Practice_01 {
    public static void main(String[] args) {
        
        int marks[] = new int[3];
        marks[0] = 45;
        marks[1] = 50;
        marks[2] = 90;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println();

        int number[] = {40,50,60,40,20,30};
        for(int i=0 ; i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}
