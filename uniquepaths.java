public class uniquepaths {

    public static void main(String[] args) {
        int m =7;
        int n =3;

        int[][] board = new int[m][n];


                // Number of ways to reach bottom right corner from last column of grid is 1
        for(int i = 0 ; i < m ; i++){

            board[i][n-1] =1;

        }


                // Number of ways to reach bottom right from corner last row of grid is 1 too
        for(int j=0; j < n ; j++){
            board[m-1][j] = 1;

        }

        for(int i = m-2 ; i >= 0 ; i--){

            for(int  j = n-2 ; j >=0 ; j--){

                board[i][j] = board[i][j+1] + board[i+1][j];
            }
        }

        System.out.println(board[0][0]);
    }
    
}