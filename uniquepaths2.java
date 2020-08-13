public class uniquepaths2 {

    public static void main(String[] args) {

        int[][] obstacleGrid = {{0,0,0},{0,0,0},{0,0,0}};

        if(obstacleGrid == null  || obstacleGrid.length == 0){
            return;
        }


        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        

        if( obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1 ){

            System.out.println("0");
            return;

        }

        int[][] board = new int[m][n];
        board[m-1][n-1] = 1;

       

        // Number of ways to reach bottom right corner from last column of grid is 1
        for (int i = m-2; i >=0; i--) {

            board[i][n - 1] = obstacleGrid[i][n-1] == 1 ? 0:board[i+1][n-1];

        }

        // Number of ways to reach bottom right from corner last row of grid is 1 too
        for (int j = n-2; j >=0; j--) {
            board[m - 1][j] = obstacleGrid[m-1][j] == 1 ? 0:board[m-1][j+1];

        }

        // for(int i =0 ; i <m ; i++){
        //     for(int j = 0 ;  j < n ;j++){
        //         System.out.print(board[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for (int i = m - 2; i >= 0; i--) {

            for (int j = n - 2; j >= 0; j--) {

                board[i][j] = obstacleGrid[i][j] == 1 ? 0 : (board[i][j + 1] + board[i + 1][j]);
            }
        }

        // System.out.println("---------------");
        // for(int i =0 ; i <m ; i++){
        //     for(int j = 0 ;  j < n ;j++){
        //         System.out.print(board[i][j]+" ");
        //     }
        //     System.out.println();
        // }




        System.out.println(board[0][0]);
    }
}