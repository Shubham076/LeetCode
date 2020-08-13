public class longestPalindromicSubstring {

    int start = 0;
    int end;

    public static void main(String[] args) {
        String s = "abdbba";
        // System.out.println(lengthOfPlaindromicSubstring(s, 0, s.length() - 1));

        longestPalindromicSubstring l = new longestPalindromicSubstring();
        for(int i=0; i<s.length()-1 ; i++){
            l.expandBoundaries(s, i, i);
            l.expandBoundaries(s, i, i+1);

        }
        String ans = s.substring(l.start, l.start+l.end);
        System.out.println("Longest palindromic SubsString is:"+ans);
        System.out.println("Length of longest palindromic substring:"+ans.length());

        }
    

    // recursive solution
    public static int lengthOfPlaindromicSubstring(String s, int start, int end) {

        if (start > end) {
            return 0;
        }

        // when only character is present
        if (start == end) {
            return 1;
        }

        // when last 2 characters are same eg='abdba'
        if (s.charAt(start) == s.charAt(end)) {
            int remaining = end - start - 1;

            if (remaining == lengthOfPlaindromicSubstring(s, start + 1, end - 1)) {
                return 2 + remaining;
            }

        }

        // when the last characters dont match;
        return (int) Math.max(lengthOfPlaindromicSubstring(s, start, end - 1),
                lengthOfPlaindromicSubstring(s, start + 1, end));
    }


    public void expandBoundaries(String s , int left ,int right){

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;

        }

        if(this.end < right-left-1){
            this.end = right-left-1;
            this.start = left+1;
        }


    }



 

}