package arvores;

class BinarySearchTree {
    private Node root;

    // Inserir um nó na árvore (iterativo)
    public void insertIterative(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // Inserir um nó na árvore (recursivo)
    public void insertRecursive(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }

        return current;
    }

    // Pesquisar um nó na árvore (iterativo)
    public boolean searchIterative(int data) {
        Node current = root;

        while (current != null) {
            if (data == current.data) {
                return true;
            }

            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    // Pesquisar um nó na árvore (recursivo)
    public boolean searchRecursive(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }

        if (data == current.data) {
            return true;
        }

        return data < current.data
                ? searchRecursive(current.left, data)
                : searchRecursive(current.right, data);
    }

    // Travessia em ordem (In-Order)
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node current) {
        if (current != null) {
            inOrderTraversal(current.left);
            System.out.print(current.data + " ");
            inOrderTraversal(current.right);
        }
    }

    // Travessia pré-ordem (Pre-Order)
    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    // Travessia pós-ordem (Post-Order)
    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node current) {
        if (current != null) {
            postOrderTraversal(current.left);
            postOrderTraversal(current.right);
            System.out.print(current.data + " ");
        }
    }

    // Altura da Árvore
    public int height() {
        return height(root);
    }

    private int height(Node current) {
        if (current == null) {
            return 0;
        }

        int leftHeight = height(current.left);
        int rightHeight = height(current.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}