

/**
 * FirstminPositive
 */
public class FirstminPositive {

    public static void main(String[] args) {
        
        int[] arr = {1,8};

        System.out.println(missing(arr));

        

        
    }

    // optimised approach
    public static int missing(int[] nums){

        if(nums == null || nums.length == 0) return 0;
        int containsOne = 0;

        for( int i  = 0 ; i < nums.length ; i++){

            if( nums[i] == 1){
                containsOne = 1;

            }
// we dont care about zeros and negative numbers
            if(nums[i] <= 0 || nums[i] > nums.length ){

                nums[i] = 1;
            } 
        }

        // if array doest  contains 1 return 1;
        if(containsOne == 0) return 1;



    // marking all the visited elements negative
        for( int i = 0 ; i< nums.length ; i++){

            // nums[i] can become negative 
            int index = Math.abs(nums[i]) -1;

            if(nums[index] > 0 ) nums[index] = -1 * nums[index]; 

        }

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] > 0){

                return i+1;
            }
        }

        return nums.length +1;


       

    }

   
}