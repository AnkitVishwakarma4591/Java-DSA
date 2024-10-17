// Clear_Bit
// Set the 3rd bit (position =2) of a number n. (n = 0101)
// i. Bit Mask : 1<<i;
// ii. Operation : AND with NOT
public class Clear_Bit {
    public static void main(String[] args){
        int n=5;
        int pos = 2;
        int BitMask = 1<<pos;
        int NotBitMask = ~(BitMask);
        int newNumber = NotBitMask & n;
        System.out.println(newNumber);
    }
}
