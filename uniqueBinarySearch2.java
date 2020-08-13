import java.util.ArrayList;
import java.util.List;

public class uniqueBinarySearch2 {

     public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }

            }

    public List<TreeNode> generateTrees(int n) {
        
        if( n == 0){
            
            List <TreeNode >  res = new ArrayList<>();
            return res;
        }
        
        return construct(1,n);
        
    }
    
    public List<TreeNode> construct(int start , int end){
        
        if(start > end){
            List <TreeNode> res = new ArrayList<>();
            res.add(null);
            return res;
        }
        
        List<TreeNode> ans = new ArrayList<>();
        
        for(int i = start ; i <= end ; i++){
            
            List<TreeNode> leftTree = construct(start , i-1);
            
            List<TreeNode> rightTree = construct(i+1,end);
            
            for( TreeNode l : leftTree){
                
                for( TreeNode r : rightTree){
                    
                    TreeNode n = new TreeNode(i , l , r);
                    ans.add(n);
                }
            }
            
        }
        
        return ans;
    }
    
}