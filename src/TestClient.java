/**
 * @author Oliver Boamah
 * This class is used for testing the BinarySearchTree class
 */
public class TestClient {

    public static void main(String[] args) {

        // instance of BinarySearchTree class
        BinarySearchTree<Integer> list = new BinarySearchTree<>();

        // add items to the tree
        System.out.println(list.insert(36));
        System.out.println(list.insert(25));
        System.out.println(list.insert(15));
        System.out.println(list.insert(30));
        System.out.println(list.insert(40));
        System.out.println(list.insert(42));
        System.out.println(list.insert(50));

        // search if items exists in the tree
        System.out.println(list.search(3));
        System.out.println(list.search(40));
        System.out.println(list.search(25));

        // prints out items using preOrder traversal
        list.preOrderTraversal();
        System.out.println();

        // print out items using inOrder traversal
        list.inOrderTraversal();
        System.out.println();

        // prints out items using postOrder traversal
        list.postOrderTraversal();
    }
}
