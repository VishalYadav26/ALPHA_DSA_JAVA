public class Clear_ith_bit{
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
     
            return n & bitMask;
      
    }
    public static void main(String args[]){
        System.out.println(clearIthBit(10,1));
    }
    
}
