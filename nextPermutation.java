public class nextPermutation {
    
    public static void main(String[] args) {

        int[] nums = {3,2,1};

        nxtPermutation(nums);

        for(int i :nums){
            System.out.print(i+" ");
        }
        
        
    }

    public static void nxtPermutation(int[] nums) {
        
        int index = -1;
        int z  = nums.length-1;
        
//         find the index of first  decreasing number
        for(int i=nums.length -1 ; i>0 ; i--){
            
            if(nums[i] > nums[i-1]){
                index = i-1;
                break;
            }
        }
        
        if(index == -1){
            reverse(nums , 0 , nums.length-1);
            return;
        }
        
//         first number greater than index
        for(int i=nums.length-1 ; i>=index+1 ; i--){
            
            if(nums[i] > nums[index]){
                z = i;
                break;
                
            }
        }
        
        swap(nums , index , z);
        
        reverse(nums , index+1 , nums.length -1);
        
        
    }
    
    public static void swap(int[] nums , int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
    public static void reverse(int[] nums , int start ,int end){
        
        while(start<end){
            
            swap(nums , start, end);
            start++;
            end--;
            
        }
    }
}