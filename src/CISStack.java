import java.util.Arrays;

public class CISStack {
// Stack = LIFO
    // Array property.
    private Object[] arr;
    // Size property.
    private int size;
    // Pointer property
    private int tail;
    // Constructor.
    public CISStack(int arraySize) {
        arr = new Object[arraySize];
        size = 0;
        tail = -1;
    }
    // Push. This method pushes a value onto the top of the stack.
    public void push(Object data) {
        tail++;
        size++;
        if (tail == arr.length) {
            Object[] original = arr;
            arr = Arrays.copyOf(arr, arr.length + 1);
        }
        arr[tail] = data;
    }
    // Pop. This method pops a value from the top of the stack.
    public Object pop() {
        Object removed = arr[size-1];
        arr[size--] = null;
        return removed;
    }
    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty() {
        return size == 0;
    }
    // size. Returns the size of the queue.
    public int size() {
        return size;
    }
    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}
    public String toString() {
        String out = "CISStack{stack=[";
        for (int i = 0; i < arr.length; i++) {
            out += arr[i] + (i == arr.length-1 ? "" : ", ");
        }
        return out + "], size=" + size + ", pointer=" + tail + "}";
    }

}
