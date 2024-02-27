package trees;

import java.util.*;
import java.util.Scanner;

public class BinaryTree {
    static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    Node root;

    public  void populate(Scanner scanner){
        System.out.println("Enter the value : ");
        int val= scanner.nextInt();
        root=new Node(val);

        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to insert at left side of the "+node.value);
        boolean left=scanner.nextBoolean();

        if (left){
            System.out.println("Enter the value for the left of "+node.value);
           int val= scanner.nextInt();
            node.left=new Node(val);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to insert at right side of the "+node.value);
        boolean right=scanner.nextBoolean();

        if (right){
            System.out.println("Enter the value for the right of "+node.value);
            int val= scanner.nextInt();
            node.right=new Node(val);
            populate(scanner,node.right);
        }
    }

    public void  prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {

        if (node==null){
            return;
        }
        //print all the right part

        prettyDisplay(node.right,level+1);

        if (level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.value);
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }
    public List<String> binaryTreePaths(Node root) {
        List<String> ans = new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }
    public void helper(Node node,List<String> ans, String str ){
        if(node.left == null & node.right==null){
            ans.add(str);
            return;
        }

        if (node.left !=null){
            helper(node.left,ans,str+node.value);
        }
        if(node.right!=null){
            helper(node.right,ans,str+node.value);
        }

    }
}
