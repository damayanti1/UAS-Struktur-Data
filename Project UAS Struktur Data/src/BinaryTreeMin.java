public class BinaryTreeMin {
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
    public BinaryTreeMin()
    {
        root = null;
    }

    public int smallestElement(Node temp)
    {
        if(root == null)
        {
            System.out.println("Data Kosong");
            return 0;
        }
        else
        {
            int leftMin, rightMin;
            int min = temp.data;
            if(temp.left != null)
            {
                leftMin = smallestElement(temp.left);
                min = Math.min(min, leftMin);
            }
            if(temp.right != null)
            {
                rightMin = smallestElement(temp.right);
                min = Math.min(min, rightMin);
            }
            return min;
        }
    }
    public static void main(String[] args) {
        BinaryTreeMin bt = new BinaryTreeMin();
        bt.root = new Node(30);
        bt.root.left = new Node(10);
        bt.root.right = new Node(91);
        bt.root.left.left = new Node(48);
        bt.root.right.left = new Node(32);
        bt.root.right.right = new Node(76);
        bt.root.right.left = new Node(62);
        bt.root.right.right = new Node(54);
        System.out.println("Elemen terkecil adalah :  " + bt.smallestElement(bt.root));
    }
}
