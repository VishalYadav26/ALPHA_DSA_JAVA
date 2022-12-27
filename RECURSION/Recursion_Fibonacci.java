public class Recursion_Fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibo_nm1 = fibo(n-1);
        int fibo_nm2 = fibo(n-2);
        int fibo = fibo_nm1+fibo_nm2;
        return fibo;

    }    
    public static void main(String args[]){
        int n =15;
        System.out.print(fibo(n));
    }
}
