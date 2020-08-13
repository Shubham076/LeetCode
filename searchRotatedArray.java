import java.util.HashMap;

public class searchRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 7;
        int index = -1;
        HashMap<Integer ,Integer> map = new HashMap<>();
        
        for(int i =0 ; i< nums.length ; i++){
            
            map.put(nums[i] , i);
        }
        
        if(map.containsKey(target)){
            index =  map.get(target);
        }
        
        System.out.println(index);
    }
}