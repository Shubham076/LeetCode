public class RegularExpressionMatching {

    public static void main(String[] args) {

        String s = "a";
        String p = "a*";

        boolean[][] board = new boolean[s.length() + 1][p.length() + 1];

        board[0][0] = true;
        // expty string and empty pattern is always true

        // eg p = a* , s = a;
        for (int j = 1; j < board[0].length; j++) {

            if (p.charAt(j - 1) == '*') {
                board[0][j] = board[0][j - 2];
            }
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {

                if (p.charAt(j - 1) == '*') {

                    // case when * is empty
                    if (board[i][j - 2]) {
                        board[i][j] = true;
                    }

                    // case 2 if * is not empty check that character before asterik is equal to
                    // string or a dot
                    // (case of repeated a single character aaaa = a*)
                    else if (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') {
                        board[i][j] = board[i - 1][j];
                    }
                }

                else if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    board[i][j] = board[i - 1][j - 1];
                }

            }
        }

        

        System.out.println(board[s.length()][p.length()]);
    }

}