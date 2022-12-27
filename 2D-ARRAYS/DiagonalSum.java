public class DiagonalSum {
    //DiagonalSum
    public static int diagonalSum(int matrix[][]){
       int sum = 0;
       //in this loop there is n^2 time complexity
    //    for (int i =0; i< matrix[0].length; i++){
    //     for (int j =0; j< matrix[0].length;j++){
    //         if(i==j){
    //             sum += matrix[i][j];
    //         }
    //         else if(i+j ==matrix[0].length-1){
    //             sum += matrix[i][j];
    //         }
       //in this loop there is n time complexity

        for(int i=0;i<matrix[0].length;i++){
            //primary diagonal
            sum+= matrix[i][i];
            //secondary diagonal

            if(i!=matrix.length-i-1)
            sum+= matrix[i][matrix.length-i-1];
        }
        return sum;
        }
       
    
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
    
}
