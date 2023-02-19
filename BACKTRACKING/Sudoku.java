import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
                };
        
        solveSudoku(board);
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                 System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    private static boolean solveSudoku(char[][] board) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.') {
                    
                    for(char c='1'; c<='9'; c++) {
                        if(isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if(solveSudoku(board) == true) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for(int i=0; i<9; i++) {
            if(board[i][col] == c) return false;
            if(board[row][i] == c) return false;
            if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] == c) return false;
        }
        return true;
    }

}
// public class Sudoku {
//     public static boolean isSafe(int sudoku[][], int row, int col, int digit){
//         //column
//         for(int i =0;i<=8;i++){
//             if(sudoku[i][col]==digit){
//                 return false;
//             }
//         }
//         //row
//         for(int j =0; j<=8;j++){
//             if(sudoku[row][j] == digit){
//                 return false;
//             }
//         }
//         //grid
//         int sr = (row/3)*3;//starting row
//         int sc = (col/3)*3;//starting col
//         //3X3 grid
//         for(int  i = sr; i<=sr+3;i++){
//             for(int j = sc; j<sc+3;j++){
//                 if(sudoku[i][j]== digit){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static boolean sudokuSolver(int sudoku[][], int row, int col){
//         //base case
//         if(row==9 ){
//             return true;
//         }
//         //recursion
//         int nextRow = row, nextCol = col+1;
//         if(col+1==9){
//             nextRow = row+1;
//             nextCol =0;
//         }

//         //Actual kaam
//         if(sudoku[row][col]!=0){
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }
//         for(int digit =1; digit<=9;digit++){
//             if(isSafe(sudoku,row,col,digit)){
//                 sudoku[row][col]=digit;
//                 if(sudokuSolver(sudoku, nextRow, nextCol)){//solution exists
//                     return true;
//                 }
//                 sudoku[row][col] =0;
//             }
//         }
//         return false;
//     }


//     public static void printSudoku(int sudoku[][]){
//         for(int i =0;i<9;i++){
//             for(int  j=0;j<9;j++){
//                 System.out.println(sudoku[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         int sudoku[][] ={
//             {0,0,8,0,0,0,0,0,0},
//             {4,9,0,1,5,7,0,0,2},
//             {0,0,3,0,0,4,1,9,0},
//             {1,8,5,0,6,0,0,2,0},
//             {0,0,0,0,2,0,0,6,0},
//             {9,6,0,0,0,5,3,0,0},
//             {0,3,0,0,7,2,0,0,4},
//             {0,4,9,0,3,0,0,5,7},
//             {8,2,7,0,0,9,0,1,3}
//         };
//         if(sudokuSolver(sudoku, 0, 0)){
//             System.out.println("Solution Exists");
//             printSudoku(sudoku);
//         }else{
//             System.out.println("Solution Does Not Exists");
//         }
//     }
// }