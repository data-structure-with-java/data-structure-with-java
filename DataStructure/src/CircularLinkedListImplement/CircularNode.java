package CircularLinkedListImplement;

public class CircularNode <T> {
    T data;
    CircularNode<T> next; //다음 노드 주소

    public CircularNode(T data) {
        this.data = data;
    }
}
