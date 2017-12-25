/**
 * @param <E>
 * @author Oliver Boamah
 * <p>
 * This class represents a node in a tree
 * Hold links to the left and right subtree
 */

public class TreeNode<E> {

    protected int element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    /**
     * sets the value of the node
     **/
    TreeNode(int e) {
        element = e;
    }

}
