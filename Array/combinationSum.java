import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public static void main(String[] args) {

        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;

        List<List<Integer>> res = new ArrayList<>();
        sum(candidates, target, res, "0", 0);
        System.out.println(res);
    }

    public static void sum(int[] nums, int amount, List<List<Integer>> res, String ans, int lastIndex) {

        if (amount == 0) {

            List<Integer> Ans = new ArrayList<>();
            for (String s : ans.split(" ")) {
                Ans.add(Integer.parseInt(s));
            }

            Ans.remove(0);
            res.add(Ans);
            return;
        }

        for (int i = lastIndex; i < nums.length; i++) {
            if (amount >= nums[i]) {

                sum(nums, amount - nums[i], res, ans + " " + nums[i], i);
            }
        }
    }

}