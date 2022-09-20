import java.util.*;
/*class BinaryTreeNode{
	public int data; 
	public BinaryTreeNode left, right; 
	public BinaryTreeNode(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}*/
class Solution {
    
    public boolean isBalanced(BinaryTreeNode root) {
        // Implement Your Code here..
        int lth,rth;
        if(root==null)
            return true;
        lth=height(root.left);
        rth=height(root.right);
        if(Math.abs(lth-rth)<=1 && isBalanced(root.left) && isBalanced(root.right))
            return true;
        return false;
        
    }
    int height(BinaryTreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}

public class BalancedTree{
	static BinaryTreeNode root;
	static BinaryTreeNode temp = root;
	void insert(BinaryTreeNode temp, int key)
    {
 
        if (temp == null) {
            root = new BinaryTreeNode(key);
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(temp);
 
        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
 
            if (temp.left == null) {
                temp.left = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		BalancedTree st=new BalancedTree();
		root=new BinaryTreeNode(Integer.parseInt(str[0]));
		for(int i=1; i<str.length; i++)
			st.insert(root,Integer.parseInt(str[i]));
		Solution sol= new Solution();
		System.out.println(sol.isBalanced(root));
	}
}
