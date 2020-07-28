public class maximunSybarray {

    public static void main(String[] args) {
        
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSoFar = nums[0];
        int maxEnding  = nums[0] ;


        // Kadanes algorithm
        for(int i =1 ; i < nums.length ; i++){

            maxEnding = (int) Math.max(maxEnding + nums[i], nums[i]);
            maxSoFar = (int) Math.max(maxSoFar, maxEnding);

            
        }


        System.out.println(maxSoFar);
    }
    
}