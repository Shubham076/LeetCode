import java.util.ArrayList;
import java.util.List;

/**
 * BinaryTreeInOrderTraversal
 */
public class BinaryTreeInOrderTraversal {


    // definition of binary tree node
    private class Node{
        int val;
        Node left;
        Node right;
        Node(int value){ this.val = value;}

        Node(int value , Node left , Node right){
            this.val = value;
            this.left = left;
            this.right = right;
        }

    }

    public List<Integer> inOrder(Node root){

        ArrayList<Integer> res = new ArrayList<>();
        inorder( root ,res);
        return res;


    }


    // recursive approach
    public void inorder(Node root , List<Integer> res){
        
        if(root == null){
            return;
        }
        else{
            if(root.left != null){
                inorder(root.left , res);
            }
            
            res.add(root.val);
            
            if(root.right != null){
                inorder(root.right , res);
            }
        }
    }


    // iterative
}