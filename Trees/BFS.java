import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
  
      if (root == null) {
        return result;
      }
  
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
  
      while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Integer> currentLevel = new ArrayList<>(levelSize);
        for (int i=0; i < levelSize; i++) {
          TreeNode currentNode = queue.poll();
          currentLevel.add(currentNode.val);
          if (currentNode.left != null) {
            queue.offer(currentNode.left);
          }
          if (currentNode.right != null) {
            queue.offer(currentNode.right);
          }
        }
        result.add(currentLevel);
      }
      return result;
    }
  
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer> result = new ArrayList<>();
  
      if (root == null) {
        return result;
      }
  
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
  
      while (!queue.isEmpty()) {
        int levelSize = queue.size();
  
        for (int i=0; i < levelSize; i++) {
          TreeNode currentNode = queue.poll();
  
          if (i == levelSize - 1) {
            result.add(currentNode.val);
          }
          
          if (currentNode.left != null) {
            queue.offer(currentNode.left);
          }
          if (currentNode.right != null) {
            queue.offer(currentNode.right);
          }
        }
      }
      return result;
    }
}  