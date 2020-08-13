import java.util.ArrayList;

public class permutationSequence {

    public static void main(String[] args) {
        
        int n = 3;
        int k = 6;

        System.out.println(permute(n , k));
    }

    public static String permute(int n , int k){

        // create a array of factorial upto n;
        int[] fact = new int[n];
        fact[0] = 1;

        for(int i = 1; i < n; i++) {

            fact[i] = i * fact[i -1];
        }

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 1; i <= n ; i++){
            nums.add(i);
        }

        StringBuilder ans = new StringBuilder();

        // for balancing the bounds as array indexing starts from 0;
        k = k-1;

        for(int i = n ; i > 0 ; i--) {

        // no of blocks are divide by n-1! first significant digit  = k / (n-1)!
            int index = k / fact[i -1];

        // update the k for discarding the remainign blocks
            k = k % fact[i-1];
        
        // append the ans in the string 
            ans.append(nums.get(index));

        // remove the used number
        nums.remove(index);



        }



        return ans.toString();


    }
    
}