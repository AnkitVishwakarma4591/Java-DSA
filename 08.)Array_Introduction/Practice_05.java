public class Practice_05 {
    public static void main(String[] args){
        String name[] = {"p","y","t","h","o","n"};
        //  int n = 0;
        for(int i=0 ; i<6 ; i++){
            for(int j=0; j<=i ; j++){
                System.out.print(name[j]);
                
            }
            System.out.println();
        }
        for(int i= 6 ; i>0 ; i--){
            for(int j=0; j<=i-1 ; j++){
                System.out.print(name[j]);
                
            }
            System.out.println();
        }
    }
}
