public class sqrt {

    public static void main(String[] args) {
        
        int n = 2147395599;

        System.out.println(root(n));
    }

    public static int root(int n){

        if( n == 0 || n == 1) return n;

        long start = 0;

        // square root of a number always be less than or equal to n/2
        long end = n /2;
        long ans = 0;

        while( start <=  end){

            long mid = (start + end) /2;

            if( mid * mid == n) {
                return (int) mid;
            }

            // since we need to find the closest value to the number therefore we updating the ans = mid  when the mid* mid  < number

            if( mid * mid < n){

                start = mid+1;
                ans = mid;
            }

            else{
                end = mid - 1;
            }
        }

        return (int) ans;
    }
    
}