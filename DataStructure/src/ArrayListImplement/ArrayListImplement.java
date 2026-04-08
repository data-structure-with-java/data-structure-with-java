package ArrayListImplement;

public class ArrayListImplement<T> {

    private Object[] elements;
    private  int size;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListImplement (){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    //요소 추가
    public void add (T value){
        ensureCapacity();
        elements[size++] = value;
    }

    //특정 인덱스 조회
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    // 요소 삭제
    public void remove(int index) {
        checkIndex(index);

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[--size] = null; // 메모리 정리
    }

    // 현재 크기
    public int size() {
        return size;
    }

    // 배열 크기 증가 (핵심!)
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }

            elements = newArray;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
