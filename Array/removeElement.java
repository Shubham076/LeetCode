/**
 * removeElement
 */
public class removeElement {

    public static void main(String[] args) {
        
        int[] nums = {3,2,2,3};

        int index = 0;
        int value = 3;
        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] != value){
                nums[index++] = nums[i];
            }
        }

        System.out.println(index);
    }
}