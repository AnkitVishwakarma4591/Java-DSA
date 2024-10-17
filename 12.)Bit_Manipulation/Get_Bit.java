// Get_Bit
// Get the 3rd bit (position =2) of a number n. (n = 0101)
// i. Bit Mask : 1<<i;
// ii. Operation : AND
public class Get_Bit {
    public static void main(String[] args){
        int n=5;
        int pos = 3;
        int BitMask = 1<<pos;
        if((BitMask & n) == 0 ){
            System.out.println("Bit was Zero");
        }
        else{
            System.out.println("Bit was One");
        }
    }
}