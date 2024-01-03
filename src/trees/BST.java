package trees;

public class BST {

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    Node root;

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    public void balanced() {
        balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void  display(){
        display(root,0);
    }

    private void display(Node node, int level) {
        if (node==null){
            return;
        }
        display(node.right,level+1);
        if (level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");

            }
            System.out.println("|------>"+node.value);

        }else {
            System.out.println(node.value);
        }
        display(node.left,level+1);


    }

    public void wordDisplay(){
        wordDisplay(this.root,"Root Node :");
    }

    private void wordDisplay(Node node, String details) {
        if (node==null){
            return;
        }
        System.out.println(details+node.value);

        wordDisplay(node.left,"Left child of : "+node.value+" is ");
        wordDisplay(node.right,"Right child of : "+node.value+" is ");

    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) {

        if (node==null){
            return;
        }

        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node) {

        if (node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");



    }
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node) {

        if (node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);




    }
}
