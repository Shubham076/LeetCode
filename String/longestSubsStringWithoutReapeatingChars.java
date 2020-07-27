import java.util.HashSet;

/**
 * longestSubsStringWithoutReapeatingChars
 */
public class longestSubsStringWithoutReapeatingChars {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }

    public static int longestSubstring(String s) {

        // lets define the pointers
        int first = 0;
        int second = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        while (second < s.length()) {
            if (!set.contains(s.charAt(second))) {

                set.add(s.charAt(second++));
                max = (int) Math.max(max, set.size());

            }

            else {
                set.remove(s.charAt(first++));
            }


        }

        return max;
    }
}