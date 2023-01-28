import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeElementSize
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public BinaryTreeElementSize()
    {
        root = null;
    }
    public int findMaximumWidth()
    {
        int maxWidth = 0;
        int nodesInLevel = 0;
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null) {
            System.out.println("Data Kosong");
            return 0;
        }
        else
        {
            queue.add(root);
            while(queue.size() != 0)
            {
                nodesInLevel = queue.size();
                maxWidth = Math.max(maxWidth, nodesInLevel);
                while(nodesInLevel > 0)
                {
                    Node current = queue.remove();
                    if(current.left != null)
                        queue.add(current.left);
                    if(current.right != null)
                        queue.add(current.right);
                    nodesInLevel--;
                }
            }
        }
        return maxWidth;
    }
    public static void main(String[] args)
    {
        BinaryTreeElementSize bt = new BinaryTreeElementSize();
        //Add nodes to the binary tree
        bt.root = new Node(2);
        bt.root.left = new Node(4);
        bt.root.right = new Node(6);
        bt.root.left.left = new Node(8);
        bt.root.left.right = new Node(10);
        bt.root.right.left = new Node(12);
        bt.root.right.right = new Node(14);
        bt.root.left.left.left = new Node(16);
        System.out.println("Size element adalah :  " + bt.findMaximumWidth());
    }
}
