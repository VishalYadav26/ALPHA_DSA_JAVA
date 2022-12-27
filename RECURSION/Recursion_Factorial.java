public class Recursion_Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        //fnm1=f of n - 1
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(fact(n));
    }
    
}
//O(n)-----time complexity
//O(n)-----Space complexity
