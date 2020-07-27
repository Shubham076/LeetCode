/**
 * serachInsertPosition
 */
public class serachInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        for( int i = 0 ; i<nums.length ; i++){
            if(nums[i]  >= target){
                System.out.println(i);
                return;
            }
        }


    }
}