public class editDistance {

    public static void main(String[] args) {
        
        String s = "intention";
        char[] s1 = s.toCharArray();
        String p  = "execution";
        char[] s2 = p.toCharArray();

        System.out.println(minWays(s1,s2));
    }

    public static int min(int a , int b , int c){
        int x = Math.min(a , b);

        return Math.min(x , c);
    }

    public static int minWays(char[] s , char[] p){

        int[][] board = new int[s.length + 1][p.length + 1];

        for(int i = 0; i < board[0].length ; i++){

            board[0][i] = i;
        }

        
        for(int i = 0; i < board.length ; i++){

            board[i][0] = i;
        }

        for(int i = 1; i < board.length ; i++){

            for(int j =1; j < board[i].length; j++){

                if(s[i-1] == p[j -1]){

                    // if last characters matches we going to check for the remaining string
                    board[i][j] = board[i -1][j -1];
                } 


                else{                         
                                                // replace        delete             insert
                    board[i][j] = 1 + min( board[i -1][j -1] , board[i -1][j] , board[i][j -1]);
                }
            }
        }

        return board[s.length][p.length];
    }
    
}