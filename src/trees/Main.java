package trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree tree=new BinaryTree();
//        Scanner scanner=new Scanner(System.in);
//        tree.populate(scanner);
//        tree.prettyDisplay();

        BST bst = new BST();

//        bst.insert(15);
//        bst.insert(10);
//        bst.insert(20);
//        bst.insert(13);
//        bst.insert(6);
//        bst.insert(3);
//        bst.display();
//        bst.wordDisplay();
        AVL tree = new AVL();

        for(int i=0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }

}
