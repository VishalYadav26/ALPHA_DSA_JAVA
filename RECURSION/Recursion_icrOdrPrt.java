// public class Recursion_icrOdrPrt {
//     public static void printIcr(int n){
//         if(n==10){
//             System.out.print(10);
//             return;
//         }
//         System.out.print(n);
//         printIcr(n+1);
//     }
//     public static void main(String args[]){
//         int n = 1;
//         printIcr(n);
//     }
// }
public class Recursion_icrOdrPrt {
    public static void printIcr(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printIcr(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        int n = 10;
        printIcr(n);
    }
}
