package DoublyLinkedListImplement;

public class DoublyNode <T> {
    T data;
    DoublyNode<T> prev; //이전 노드 주소
    DoublyNode<T> next; //다음 노드 주소

    public DoublyNode(T data) {
        this.data = data;
    }
}
