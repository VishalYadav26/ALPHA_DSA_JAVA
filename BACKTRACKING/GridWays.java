public class GridWays {
    //T(n) => 2^(n+m) = Exponential

    //2nd Method Optimised Approach Linear TC
    //Mathematical method
    // (n-1 + m-1)!/(n-1)!(m-1)! = O(n+m) => Linear

    public static int gridWays(int i ,int  j, int n , int m){
        //base case
        if(i == n-1 && j== m-1){
            //condition for last call
            return 1;
        }else if(i==n || j==m){//boundary cross cond
            return 0;
        }

        int ways1 = gridWays(i+1, j, n, m);
        int ways2 = gridWays(i, j+1, n, m);
        return ways1 + ways2;
    }


    public static void main(String args[]){
        int n =3, m =3;
        System.out.println(gridWays(0,0,n,m));
    }
}
