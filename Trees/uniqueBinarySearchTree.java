public class uniqueBinarySearchTree {

    public static void main(String[] args) {

        int start =(int) System.currentTimeMillis();

        int n = 3;
        
        int[] count = new int[n+1];
        
        count[0] = count[1] = 1;
        
        for(int i = 2 ; i <=n ; i++){
            
            for( int j = 0 ; j <= i-1;  j++){
                
                count[i] += count[j] * count[i-j-1];
            }
        }

        int end = (int) System.currentTimeMillis();
        
        System.out.print(count[n] + "\n"+ (end-start)+"ms");
    }
    
}