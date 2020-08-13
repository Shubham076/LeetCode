public class wildcardMtaching {
    public static void main(String[] args) {

        String s = "aa";
        String p = "*";

        boolean[][] board = new boolean[s.length() + 1][p.length() + 1];

        board[0][0] = true;

        for (int j = 1; j < board[0].length; j++) {

            if (p.charAt(j - 1) == '*') {

                board[0][j] = board[0][j - 1];

            }
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {

                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    board[i][j] = board[i - 1][j - 1];
                }

                if (p.charAt(j - 1) == '*') {
                    board[i][j] = board[i][j - 1] || board[i - 1][j];
                }
            }
        }

        System.out.println(board[s.length()][p.length()]);
    }

}