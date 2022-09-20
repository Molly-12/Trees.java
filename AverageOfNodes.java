import java.util.*;

/*
    //Structure of BinaryTreeNode for your reference.

    class BinaryTreeNode{
    	public int data; 
    	public BinaryTreeNode left, right; 
    	public BinaryTreeNode(int data){
    		this.data = data; 
    		left = null; 
    		right = null; 
    	}
    }
*/

class Solution {
    public List<Double> averageOfLevels(BinaryTreeNode root) {
        //Implement your code here.
       
       Queue<BinaryTreeNode> q=new LinkedList();
       q.add(root);
       List<Double>l=new ArrayList();
       while(!q.isEmpty()){
           
           int size=q.size();
           double sum=0;
           for(int i=0;i<size;i++){
               BinaryTreeNode temp=q.poll();
               sum+=temp.data;
               if(temp.left!=null){
                   q.add(temp.left);
               }
               if(temp.right!=null){
                   q.add(temp.right);
               }
           }
           l.add(sum/size);
           
       }
       return l;
        
    }
}
