package trees;

public class SegmentTree {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();

        System.out.println(tree.query(2, 6));

    }

    public  static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

     public SegmentTree(int[] arr) {
         this.root=constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
         if (start==end){
             Node leaf= new Node(start,end);
             leaf.data=arr[start];
             return leaf;
         }

         Node node=new Node(start,end);

         int mid = (start+end)/2;
         node.left=this.constructTree(arr,start,mid);
         node.right=this.constructTree(arr,mid+1,end);
         node.data=node.left.data+node.right.data;

         return node;
    }

    public void  display(){
         display(this.root);
    }

    public int query(int startInterval,int endInterval){
         return this.query(this.root,startInterval,endInterval);
    }

    private int query(Node node, int startInterval, int endInterval) {
         if (node.startInterval>=startInterval && node.endInterval<=endInterval){
             return node.data;
         }else if (node.endInterval<startInterval || node.startInterval>endInterval){
             return 0;
         }else {
             return this.query(node.left,startInterval,endInterval)+this.query(node.right,startInterval,endInterval);
         }
     }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if (node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }

    public void update(int index,int value){
         this.root.data=update(this.root,index,value);
    }

    private int update(Node node, int index, int value) {
    if (index>= node.startInterval && index<=node.endInterval){
        if (index==node.startInterval && index==node.endInterval){
            node.data=value;
            return node.data;
        }else {
            int leftAns=update(node.left,index,value);
            int rightAns=update(node.right,index,value);
            node.data=leftAns+rightAns;
        }
    }
    return node.data;
     }
}
