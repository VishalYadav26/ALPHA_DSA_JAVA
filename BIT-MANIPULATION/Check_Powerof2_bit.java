public class Check_Powerof2_bit {
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.println( isPowerOfTwo(16));
    }
}
