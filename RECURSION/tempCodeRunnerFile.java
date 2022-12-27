public static int expo( int x, int n){

        if(n==0 || n==1){
            return x;
        }
        int expo1 = x * expo(x, n-1);
        // int expo2 = x * expo(int x, int n-2);
        return expo1;
    }
    public static void main(String args[]){
        // int x;
        // int n;
        System.out.print(expo(2,5));
    }