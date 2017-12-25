/**
 * @param <E>
 * @author Oliver Boamah
 * This class contains implementation of BinarySearchTree
 */

public class BinarySearchTree<E> {

    /**
     * the root node of the tree
     */
    private TreeNode<E> rootNode;


    /**
     * adds an item to the tree
     *
     * @param e the integer to add
     * @return
     */
    public boolean insert(int e) {

        TreeNode<E> currentNode;
        if (rootNode == null) {
            rootNode = new TreeNode<>(e);
        } else {
            // look for parent of new node to be created
            TreeNode<E> parent;
            parent = currentNode = rootNode;
            while (currentNode != null) {

                if (currentNode.element > e) {
                    parent = currentNode;
                    currentNode = currentNode.left;
                } else if (currentNode.element < e) {
                    parent = currentNode;
                    currentNode = currentNode.right;
                } else {
                    throw new RuntimeException("This Binary Tree cannot contain duplicates");
                }
            }
            // attach new node to parent
            if (e > parent.element) {
                parent.right = new TreeNode<>(e);
            } else {
                parent.left = new TreeNode<>(e);
            }
        }

        return true;
    }

    /**
     * searches the tree for an item
     *
     * @param e the integer to search for
     * @return
     */
    public boolean search(int e) {

        TreeNode<E> currentNode = rootNode;
        while (currentNode != null) {
            if (e < currentNode.element) {
                currentNode = currentNode.left;
            } else if (e > currentNode.element) {
                currentNode = currentNode.right;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * traverse elements using preOder
     */
    public void preOrderTraversal() {
        preOrder(rootNode);
    }

    /**
     * traverse elements using postOrder
     */
    public void inOrderTraversal() {
        inOrder(rootNode);
    }

    /**
     * traverse elements using postOrder
     */
    public void postOrderTraversal() {
        postOrder(rootNode);
    }

    /**
     * root, left, right
     * recursive preOrder implementation
     *
     * @param currNode the current node
     */
    private void preOrder(TreeNode<E> currNode) {
        if (currNode != null) {
            System.out.print(currNode.element + ", ");
            preOrder(currNode.left);
            preOrder(currNode.right);
        }
    }

    /**
     * left, root, right
     * recursive inOder implementation
     *
     * @param currNode the current node
     */
    private void inOrder(TreeNode<E> currNode) {
        if (currNode != null) {
            inOrder(currNode.left);
            System.out.print(currNode.element + ", ");
            inOrder(currNode.right);
        }
    }


    /**
     * left, right, root
     * recursive postOrder implementation
     *
     * @param currNode the current node
     */
    private void postOrder(TreeNode<E> currNode) {
        if (currNode != null) {
            postOrder(currNode.left);
            postOrder(currNode.right);
            System.out.print(currNode.element + ", ");
        }
    }

}
