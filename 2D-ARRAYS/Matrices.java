import java.util.*;
public class Matrices{
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
      //  int n=3, m=3;
         int n = matrix.length, m = matrix[0].length;
        System.out.print();
        Scanner sc = new Scanner(System.in);
        System.out.println();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print( matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
