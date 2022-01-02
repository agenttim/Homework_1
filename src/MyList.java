public class MyList {

    private static final int DEFAULT_SIZE = 10; // размер массива по умолчанию
    private int[] elements; // объявление переменной массива
    private int size; // счетчик заполнения массива

    // Конструктор, создающий массив со значением по умолчанию
    public MyList() {
        this.elements = new int[DEFAULT_SIZE];
        this.size = 0;
    }

    // Метод, добавляющий новый элемент в конец массива
    public void add(int element) {
        if (size == elements.length) {
            resize();
        }
        this.elements[size] = element;
        size++;
    }

    // Метод, увеличивающий емкость массива на 50%
    private void resize() {
        int[] newElements = new int[elements.length + elements.length / 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        this.elements = newElements;
    }

    // Метод, возвращающий количество хранящихся в массиве элементов
    public int size() {
        return size;
    }

    // Метод, возвращающий значение элемента по индексу в массиве
    public int get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            System.err.println("Out of bounds");
            return -1;
        }
    }

    // Метод, удаляющий элемент массива по значению
    public void remove(int element) {

        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                System.arraycopy(elements, i+1, elements, i, size - i - 1);
                break;
            }
        }
        size--;
    }

    // Метод, удаляющий элемент массива по индексу
    public void removeByIndex(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            size--;
        }
    }

    // Метод, реализующий пузырьковую сортировку
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

    // Метод, заменяющий элемент в массиве по заданному индексу и новому значению
    public void set(int index, int element) {
        elements[index] = element;
    }
}


