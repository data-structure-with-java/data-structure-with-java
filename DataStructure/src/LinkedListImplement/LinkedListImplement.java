package LinkedListImplement;

public class LinkedListImplement<T> {

    private Node<T> head;
    private int size;

    //맨 뒤에 추가
    public void add (T data){
        Node<T> newNode = new Node<>(data);

        if(head == null){
            head =newNode;
        } else {
            Node<T> current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public void remove(int index) {
        checkIndex(index);

        if(index == 0){
            head = head.next;
        } else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }

        size--;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
