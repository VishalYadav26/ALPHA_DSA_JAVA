public class NQueens_onlyOneSoln {
    //TC => O(n!)

    //T(n) = time to place  1 Queen * T(n-1) +isSafe()
    // t(n) = O(n)*O(n-1)
    static int count =0;
    public static boolean nQueens(char board[][],int row){
        //base cases
        if(row ==board.length){
            // printBoard(board);
            count++;
            return true;
        }


        //columns loop
        for(int j =0;j<board.length;j++){

            if(isSafe(board, row, j)){
                board[row][j] ='Q';
                nQueens(board, row+1);//function call
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'X';//Backtracking step
            }
            // board[row][j] ='Q';
            // nQueens(board, row+1);//function call
            // board[row][j] = 'X';//Backtracking step
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col){
        //we don't need to check for down side because we r placing from upper part of chess board
        //three cases:=

        //vertical up
        for(int i =row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }


        //diagonal left up
        for(int i =row-1, j = col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j] =='Q'){
                return false;
            }
        }


        //diagonal right up
        for(int i =row-1, j = col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j] =='Q'){
                return false;
            }
        }

        return true;
    }
    public static void printBoard(char board[][]){
        System.out.println("---------CHESS BOARD-------");
        for(int i =0; i<board.length;i++){
            for(int  j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n =4;
        char board[][]= new char[n][n];
        //initialize
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j]= 'X';
            }
        }
        if(nQueens(board,0)){
            System.out.println("Solution is Possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        // System.out.println("total ways to solve n queens =" + count);
    }
}
