class Solution {
    //  public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> postorder_list = new ArrayList<>();
      public List<Integer> postorderTraversal(TreeNode root){
          if(root!=null){ 
              postorderTraversal(root.left);
              postorderTraversal(root.right);
              postorder_list.add(root.val);
          }
          return postorder_list; 
      }
  }