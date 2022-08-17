class Solution {
    public boolean isSymmetric(TreeNode root) {
          return _isSymmetric(root.left,root.right);   
    }
    
    public boolean _isSymmetric(TreeNode l, TreeNode r){
        
        if(l == null || r == null){
            return l == r;
        }
        
        return (l.val == r.val) && _isSymmetric(l.left,r.right) && _isSymmetric(l.right,r.left);
    }
}