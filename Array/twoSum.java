import java.util.HashMap;

class twoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 9, 11 };
        int target = 9;
        int[] ans = two_sum(nums, target);

        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    public static int[] two_sum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {

                return new int[] { map.get(target - nums[i]), i };

            }

            else {
                map.put(nums[i], i);

            }
        }

        return new int[] { -1, -1 };

    }
}