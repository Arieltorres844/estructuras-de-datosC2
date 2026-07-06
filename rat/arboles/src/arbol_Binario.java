
public class arbol_Binario {
    
    Node root;
    
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.vaule) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.vaule) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }
    
    public void add(int value) {
        root = addRecursive(root, value);
    }
    
    private int findSmallestValue(Node root) {
        return root.left == null ? root.vaule : findSmallestValue(root.left);
    }
    
    public void delete(int value) {
        root = deletedRecursived(root, value);
    }
    
    private Node deletedRecursived(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.vaule) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.vaule = smallestValue;
            current.right = deletedRecursived(current.right, smallestValue);
            return current;
        }
        if (value < current.vaule) {
            current.left = deletedRecursived(current.left, value);
            return current;
        }
        current.right = deletedRecursived(current.right, value);
        return current;
    }

    public void traversePreOrder(Node nd) {
        if (nd != null) {
            System.out.println("" + nd.vaule);
            traversePreOrder(nd.left);
            traversePreOrder(nd.right);
        }
    }
}
