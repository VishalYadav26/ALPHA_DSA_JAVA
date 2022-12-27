public class Recursion_SumOf_N_natural {

    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int Snm1= calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(calcSum(n));
    }
    
}
//O(n)-----time complexity
//O(n)-----Space complexity
