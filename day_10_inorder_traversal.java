class Solution {
    // public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> l = new ArrayList<>();
   
   void inorder(TreeNode root){
           if(root == null){
               return;
           }
           else{
           inorder(root.left);
           l.add(root.val);
           inorder(root.right);
       }
   }
   
   public List<Integer> inorderTraversal(TreeNode root) {
       
       inorder(root);
       return l;
   }
   }