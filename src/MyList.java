import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList {

    private static final int DEFAULT_SIZE = 10; // размер массива по умолчанию
    private int[] elements; // объявление переменной массива
    private int size; // счетчик заполнения массива

    public MyList() {
        this.elements = new int[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add(int element) {
        if (size == elements.length) {
            resize();
        }
        this.elements[size] = element;
        size++;
    }

    private void resize() {
        int[] newElements = new int[elements.length + elements.length / 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            System.err.println("Out of bounds");
            return -1;
        }
    }

    public void remove(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                System.arraycopy(elements, i + 1, elements, i, size - i);
                break;
            }
        }
        size--;
    }

    public void sort() {
        for (int a = 1; a < size; a++) {
            for (int b = size - 1; b >= a; b--) {
                if (elements[b-1] > elements[b]) {
                    int c = elements[b-1];
                    elements[b-1] = elements[b];
                    elements[b] = c;
                }
            }
        }
    }














}


