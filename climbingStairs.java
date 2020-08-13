public class climbingStairs {

    public static void main(String[] args) {
        
       System.out.println( ways(4) ); 
    }

    public static int ways(int n ){

        int[] board = new int[n+1];

        board[0] = board[1] = 1;

        for(int i = 2; i <board.length ; i++){

            board[i] = board[i -1] + board[i -2];
        }

        return board[n];
    }
    
}