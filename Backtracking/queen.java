public class queen{
    public static boolean isSafe(char board[][], int  row,int  col){
        // virteacly up
        for(int i = row-1; i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // dagi left
        for(int i=row-1,  j=col-1 ;i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // dagi right
        for(int i =row-1,  j = col+1; i>=0 && j<board.length;i--, j++){
            if(board[i][j]=='Q'){
               return false;
            }
        }
        return true;
    }

    // finding combinantion
    public static void findQueen(char board[][], int row){
        if(row==board.length){
            printBoard(board);
            return;

        }
       
            for(int j = 0;j<board.length;j++){
                if(isSafe(board,row,j)){

                board[row][j] = 'Q';
                findQueen(board,row+1); // function calling
                board[row][j]='X'; // backtracking step
                }

            }
        
    }
    // for printing the board
    public static void printBoard(char board[][]){
        System.out.println("========================");
        for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board.length;j++){
                
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 5;
        char board[][] = new char[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
              board[i][j] = 'X';
            }
        }
        findQueen(board,0);
    }
}