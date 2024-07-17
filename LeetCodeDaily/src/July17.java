

import java.util.ArrayList;
import java.util.HashSet;


    public class July17 {
        public class TreeNode {
            int val;
            July17.TreeNode left;
            July17.TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, July17.TreeNode left, July17.TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
        HashSet<Integer> set;
        ArrayList<TreeNode> ans;
        public ArrayList<TreeNode> delNodes(TreeNode root, int[] to_delete) {
            ans= new ArrayList<>();
            set= new HashSet<>();
            for(int element: to_delete){
                set.add(element);
            }
            helper(root, true);
            return ans;
        }
        public TreeNode helper(TreeNode node, boolean is_root){
            if(node==null){
                return null;
            }
            boolean is_deleted= set.contains(node.val);
            if(is_root && !is_deleted){
                ans.add(node);
            }
            node.left=helper(node.left, is_deleted);
            node.right= helper(node.right, is_deleted);
            return is_deleted ? null: node;
        }


    }


