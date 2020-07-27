public class firstLatIndex {

    public static void main(String[] args) {

        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int[] arr = new int[2];
        arr[0] = first(nums, 0, 8);
        arr[1] = lastIndex(nums, 0, 8);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int first(int[] nums, int i, int value) {

        if (i == nums.length)
            return -1;
        if (nums[i] == value)
            return i;

        return first(nums, i + 1, value);
    }

    public static int lastIndex(int[] nums, int i, int value) {

        if (i == nums.length)
            return -1;

        int index = lastIndex(nums, i + 1, value);

        if (index == -1) {

            if (nums[i] == value)
                return i;
            else
                return -1;
        } else
            return index;
    }

}