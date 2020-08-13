import java.util.Arrays;

public class longestValidparanthesis {

    public static void main(String[] args) {

        String s = "(()";

        // System.out.println(longest(s));

        System.out.println(longestValidParanthesis(s));

        

        
        

    }


    // using dp
    public static int longest(String s){

        int[] board = new int[s.length()];

        for (int i = 1; i < board.length; i++) {

            // case1 when we get opening bracket put 0 ;
            if (s.charAt(i) == '(') {
                board[i] = 0;
            }

            // case 2 when we get a close bracket
            else {

                // check for the previous character in the string if it is open then its a pair
                // i>2 for keeping array in the bounds

                if (s.charAt(i - 1) == '(') {
                    board[i] = 2 + (i > 2 ? board[i - 2] : 0);
                }

                // check first character before the pair to immediate left of closing bracket
                // eg = "()(())"
                if (i - board[i - 1] >= 1 && s.charAt(i - board[i - 1] - 1) == '(') {
                    board[i] = 2 + board[i - 1] + (i - board[i - 1] >= 2 ? board[i - board[i - 1] - 2] : 0);
                }
            }
        }

        return Arrays.stream(board).max().getAsInt();

    }



    // without using dp time =  O(N) space = O(1)
    public static int longestValidParanthesis(String s){

        int left = 0;
        int right = 0;
        int max = 0;

        // left 2 Right Scan
        for(int i = 0 ; i< s.length() ; i++){

            if(s.charAt(i) == '('){
                left++;
            }

            else{
                right++;
            }

            if(left == right){
                max = (int) Math.max(max , 2*right);
            }

            else if (right > left){
                left = right = 0;

            }
        }

        left = right = 0;

        // right 2 left scan

        for(int i = s.length() -1 ; i>=0; i--){

            if(s.charAt(i) == '('){
                left++;
            }

            else{
                right++;
            }

            if(left == right){
                max = (int) Math.max(max , 2*left);
                            }

        else if(left > right){
            left = right = 0;
            }

        }

        return max;
    } 

}