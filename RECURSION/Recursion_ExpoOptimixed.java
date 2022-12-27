public class Recursion_ExpoOptimixed {
    public static int optiExpo(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpower = optiExpo(a, n/2);
        int halfPowerSqr = halfpower*halfpower;
        //n is odd
        if(n % 2!= 0){
            halfPowerSqr = a * halfPowerSqr;
        }
        return halfPowerSqr;
    }
    public static void main(String args[]){
        int a =2;
        int n =10;
        System.out.print(optiExpo(a,n));


    }
    
}
