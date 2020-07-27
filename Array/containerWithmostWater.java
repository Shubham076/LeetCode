public class containerWithmostWater {

    public static void main(String[] args) {
        
        int[] height = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int area = 0;
        int right = height.length-1;

        while(left<right){

            area = (int)Math.max(area, (int)Math.min(height[left], height[right]) *(right-left));

            if(height[left]<height[right]){
                left++;
            }

            else{
                right--;
            }


        }

        System.out.println("Maximum area is:"+area);

    }
        
}