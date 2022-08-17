class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
    if(root == null) return ans;
    
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    
    while(!queue.isEmpty()){
        int q_size = queue.size();
        
        List<Integer> lst = new ArrayList<>();
        
        for(int i=0;i<q_size;i++){
            TreeNode dummyNode = queue.poll();
            lst.add(dummyNode.val);
            
        if(dummyNode.left!=null)
            queue.add(dummyNode.left);
        
        if(dummyNode.right!=null)
            queue.add(dummyNode.right);
        }
        ans.add(lst);
    }
    return ans;
    }
}
