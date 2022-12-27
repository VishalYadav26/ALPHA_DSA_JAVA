public class Modula_Expo_bit {
    public static int modularExpo(int a, int n,int x){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                //check LSB
                ans = ans*a; 
            }
            a = a*a;
            n =n>>1;

        }
        return ans%x;
    }
    public static void main(String args[]){
        System.out.println(modularExpo(2,3,5));
    }
}
