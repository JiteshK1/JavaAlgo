package tree_ques;

import java.util.*;

public class BFS {

    int diameter;

    static class Node {
        int val;
        Node left;

        Node right;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }

    Node root;


    public List<List<Integer>> print(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        ;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentlist = new ArrayList<>();
            for (int i = 0; i < queue.size(); i++) {
                Node currentNode = queue.poll();
                currentlist.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentlist);
        }


        return result;
    }

    public List<Double> averageSum(Node root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            double averageLevel = 0;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                averageLevel += currentNode.val;
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            averageLevel = averageLevel / levelSize;
            result.add(averageLevel);
        }

        return result;
    }

    public Node averageSum(Node root, int element) {
        if (root == null) return null;

        List<Double> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            Node currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == element) {
                break;
            }
        }

        return queue.peek();
    }

    public List<List<Integer>> zigZagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> deque = new LinkedList<>();

        deque.addFirst(root);

        boolean rev = false;
        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> currentlist = new ArrayList<>();
            for (int i = 0; i < deque.size(); i++) {
                if (!rev) {
                    Node currentNode = deque.pollFirst();
                    currentlist.add(currentNode.val);
                    if (currentNode.left != null) {
                        deque.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        deque.addLast(currentNode.right);
                    }
                } else {
                    Node currentNode = deque.pollLast();
                    currentlist.add(currentNode.val);

                    if (currentNode.right != null) {
                        deque.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        deque.addFirst(currentNode.left);
                    }
                }
            }
            rev = !rev;
            result.add(currentlist);
        }


        return result;
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMost = root;
        while (leftMost.left != null) {
            Node current = leftMost;
            while (current != null) {
                leftMost.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    //tree right side view

    public List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
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

    public boolean isCousins(Node root, int x, int y) {
        Node xx = findNode(root, x);
        Node yy = findNode(root, y);


        return (
                (level(root, xx, 0) == level(root, yy, 0)) && (!siblings(root, xx, yy))
        );

    }

    private boolean siblings(Node node, Node xx, Node yy) {
        if (node == null) {
            return false;
        }

        return ((node.left == xx && node.right == yy) || (node.left == yy && node.right == xx) || siblings(node.left, xx, yy) || siblings(node.right, xx, yy));
    }

    private int level(Node node, Node xx, int lev) {
        if (node == null) {
            return 0;
        }
        if (node == xx) {
            return lev;
        }
        int l = level(node.left, xx, lev + 1);
        if (l != 0) {
            return l;
        }

        return level(node.right, xx, lev + 1);
    }

    private Node findNode(Node node, int x) {
        if (node == null) {
            return null;
        }

        if (node.val == x) {
            return node;
        }
        Node n = findNode(node.left, x);
        if (n != null) {
            return n;
        }
        return findNode(node.right, x);
    }


    public boolean isSymmetric(Node node) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(node.left);
        queue.offer(node.right);
        while (!queue.isEmpty()) {

            Node left = queue.poll();
            Node right = queue.poll();

            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);

        }
        return true;
    }

    public int diameterOfBinaryTree(Node root) {
        height(root);
        return diameter - 1;
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(dia, diameter);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public Node inverseTree(Node root) {
        if (root == null) {
            return null;
        }
        Node left = inverseTree(root.left);
        Node right = inverseTree(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    public void flatten(Node root) {
        Node current = root;
        while (current != null) {
            if (current.left != null) {
                Node temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;

                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    public boolean isValidBST(Node root) {
        return helper(root, null, null);
    }

    private boolean helper(Node node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }
        if (low != null && node.val <= low) {
            return false;
        }
        if (high != null && node.val >= high) {
            return false;
        }

        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;
    }


    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        return left == null ? right : left;
    }


    int count = 0;

    public int kthSmallest(Node root, int k) {
        return helper(root, k).val;
    }

    private Node helper(Node root, int k) {
        if (root == null) {
            return null;
        }
        Node left = helper(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }
        return helper(root.right, k);
    }

    public Node buildTree(int[] preOrder, int[] inOrder) {
        if (preOrder.length == 0) {
            return null;
        }
        int r = preOrder[0];
        int index = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == r) {
                index = i;
            }
        }
        Node node = new Node(r);
        buildTree(Arrays.copyOfRange(preOrder, 1, index + 1), Arrays.copyOfRange(inOrder, 0, index + 1));
        buildTree(Arrays.copyOfRange(preOrder, index + 1, preOrder.length), Arrays.copyOfRange(inOrder, index + 1, preOrder.length));
        return node;
    }

    public boolean hasPath(Node root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }

        return hasPath(root.left, root.val - sum) || hasPath(root.right, root.val - sum);
    }

    public int pathNumber(Node root) {
        return helper2(root, 0);
    }

    private int helper2(Node root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null) {
            return sum;
        }
        return helper2(root.left, sum) + helper2(root.right, sum);
    }

    int ans = Integer.MIN_VALUE;

    public int maxPathSum(Node root) {
        helper3(root);
        return ans;
    }

    private int helper3(Node node) {
        if (node == null) {
            return 0;
        }

        int left = helper3(node.left);
        int right = helper3(node.right);

        left = Math.max(0, left);
        right = Math.max(0, right);

        int path = left + right + node.val;
        ans = Math.max(ans, path);

        return Math.max(left, right) + node.val;
    }

    public boolean findPath(Node root, int[] arr) {
        if (root == null) {
            return arr.length == 0;
        }
        return helper(root, arr, 0);

    }

    private boolean helper(Node root, int[] arr, int index) {
        if (root == null) {
            return false;
        }

        if (index >= arr.length || root.val != arr[index]) {
            return false;
        }
        if ((root.left == null && root.right == null) && index == arr.length - 1) {
            return true;
        }
        return helper(root.left, arr, index + 1) || helper(root.right, arr, index + 1);
    }

    public int possiblePathSum(Node root, int sum) {
        List<Integer> path = new ArrayList<>();
        return helper(root, path, sum);

    }

    private int helper(Node root, List<Integer> path, int sum) {
        if (root == null) {
            return 0;
        }
        path.add(root.val);

        int count = 0;
        int s = 0;
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()) {
            s += itr.previous();

            if (s == sum) {
                count++;
            }
        }


        count += helper(root.left, path, sum) + helper(root.right, path, sum);

        path.removeLast();
        return count;
    }

}
