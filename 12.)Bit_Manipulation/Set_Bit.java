// Set_Bit
// Set the 2rd bit (position =1) of a number n. (n = 0101)
// i. Bit Mask : 1<<i;
// ii. Operation : OR
public class Set_Bit {
    public static void main(String[] args){
        int n=5;
        int pos = 1;
        int BitMask = 1<<pos;
        int newNumber = BitMask | n;
        System.out.println(newNumber);
    }
}
