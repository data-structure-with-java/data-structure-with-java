package DoublyLinkedListImplement;

public class DoublyLinkedListImplement <T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int size;

    // 뒤에 추가
    public void add(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    // 특정 인덱스 조회
    public T get(int index) {
        checkIndex(index);

        DoublyNode<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // 삭제
    public void remove(int index) {
        checkIndex(index);

        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            DoublyNode<T> current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        size--;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
