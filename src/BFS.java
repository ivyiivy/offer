import java.util.*;

public class BFS {
    private  class Node{
        int val;
        ArrayList<Node> children;
    }
    public  void bfs(Node root){
        if (root==null)
            return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        Set<Node> visited=new HashSet<>();
        Node node=new Node();
        while(!queue.isEmpty()){
            node=queue.poll();
            //
            for (Node child:node.children){
                if (child!=null&&!visited.contains(child))
                    queue.add(child);
            }
        }
    }
}
