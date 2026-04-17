package TreeImplement;

public class BinaryTree<T> {

    Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    /*
    * 전위 순회 : 루트 노드부터 시작해 왼쪽 서브트리를 전위 훈회 하고, 이후 오른쪽 서브트리를 전위 순회하는 순회방법
    * 중위 순회 : 루트 노드 기준 왼쪽 서브트리를 중위 순회한 다음, 루트 노드를 방문하고 오른쪽 서브트리를 중위 순회하는 순회방법
    * 후위 순회 : 루트 노드 기준 왼쪽 서브트리를 후위 순회하고, 오른쪽 서브트리까지 후위 순회한 다음, 루트 노드를 방문하는 순서의 순회방법
    */

    // 전위 순회
    void preorder(Node<T> node){
        if(node == null) return;

        System.out.print("[" +node.data + "] ");
        preorder(node.left);
        preorder(node.right);
    }

    // 중위 순회
    void inorder(Node<T> node){
        if(node == null) return;

        inorder(node.left);
        System.out.print("[" +node.data + "] ");
        inorder(node.right);
    }

    // 후위 순회
    void postorder(Node<T> node){
        if(node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print("[" +node.data + "] ");
    }
}