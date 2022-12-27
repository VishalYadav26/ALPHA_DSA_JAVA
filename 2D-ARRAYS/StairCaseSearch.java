public class StairCaseSearch {
    public static boolean StairCaseSearch(int matrix[][],int key){
        int row =0,col =matrix[0].length-1;
        while (row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at (" + row + "," + col +")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not Found!");
        return false;
    }

//     int row = matrix[0].length-1,col =0;
//     while (row>matrix.length && col<=0){
//         if(matrix[row][col]==key){
//             System.out.println("found key at (" + row + "," + col +")");
//             return true;
//         }
//         else if(key>matrix[row][col]){
//             col++;
//         }
//         else {
//             row--;
//         }
//     }
//     System.out.println("Key not Found!");
//     return false;
// }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
        {15,25,35,40},
        {27,29,37,48},
        {32,33,29,50}};
        int key = 35;
        StairCaseSearch(matrix,key);
    }
    
}

 