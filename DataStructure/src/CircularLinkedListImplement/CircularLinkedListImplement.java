package CircularLinkedListImplement;

public class CircularLinkedListImplement <T> {
    private CircularNode<T> head;
    private int size;

    // 추가
    public void add(T data) {
        CircularNode<T> newCircularNode = new CircularNode<>(data);

        if (head == null) {
            head = newCircularNode;
            head.next = head;
        } else {
            CircularNode<T> current = head;

            while (current.next != head) {
                current = current.next;
            }

            current.next = newCircularNode;
            newCircularNode.next = head;
        }

        size++;
    }

    // 조회
    public T get(int index) {
        checkIndex(index);

        CircularNode<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // 삭제
    public void remove(int index) {
        checkIndex(index);

        if (index == 0) {
            if (size == 1) {
                head = null;
            } else {
                CircularNode<T> last = head;

                while (last.next != head) {
                    last = last.next;
                }

                head = head.next;
                last.next = head;
            }
        } else {
            CircularNode<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }

        size--;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
