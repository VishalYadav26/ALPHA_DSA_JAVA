public class NQueens {
    //TC => O(n!)

    //T(n) = time to place  1 Queen * T(n-1) +isSafe()
    // t(n) = O(n)*O(n-1)
    public static void nQueens(char board[][],int row){
        //base cases
        if(row ==board.length){
            printBoard(board);
            return;
        }


        //columns loop
        for(int j =0;j<board.length;j++){

            if(isSafe(board, row, j)){
                board[row][j] ='Q';
                nQueens(board, row+1);//function call
                board[row][j] = 'X';//Backtracking step
            }
            // board[row][j] ='Q';
            // nQueens(board, row+1);//function call
            // board[row][j] = 'X';//Backtracking step
        }
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
        int n =8;
        char board[][]= new char[n][n];
        //initialize
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j]= 'X';
            }
        }
        nQueens(board,0);
    }
}
// : ”Number of ways of placing n nonattacking queens on an n X n board.”

// Starting at n=0, we have:

// 1, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512, 95815104, 666090624, 4968057848, 39029188884, 314666222712, 2691008701644, 24233937684440, 227514171973736, 2207893435808352, 22317699616364044, 234907967154122528

// The examples make clear that different rotations or mirror images are counted as different solutions in this sequence.

// So, we find n=8 gives 92.

// I also see in the entry a conjecture that the asymptotic numbers of solutions is  n!/cn
//   where  c
//   is a constant that’s approximately 2.54.