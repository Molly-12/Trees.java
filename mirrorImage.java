
//TreeNode Structure for Your Reference..

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
    boolean isSymmetric(BinaryTreeNode r1,BinaryTreeNode r2){
        if(r1==null && r2==null)
            return true;
        if(r1==null || r2==null)
            return false;
        if(r1.data!=r2.data)
            return false;
        return (isSymmetric(r1.left,r2.right) &&isSymmetric(r1.right,r2.left));
    }
    public boolean isSelfMirrorTree(BinaryTreeNode root) {
        return isSymmetric(root.left,root.right);
        // Implement Your Code here..
    }
}
