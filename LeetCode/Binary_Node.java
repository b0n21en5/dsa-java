

import java.util.Scanner;

class NodeTree{
    int root;
    NodeTree right, left;

    NodeTree(int data){
        
        root = data;
        right = left = null;
    }
}

public class Binary_Node {

    NodeTree root;

    int maxDepth(NodeTree root){

        if (root == null)
            return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right)+1;
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Binary_Node tree = new Binary_Node();
        
        System.out.println(tree.root = new NodeTree(num));

        sc.close();
    }
}
