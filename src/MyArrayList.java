public interface MyArrayList<T> {

    boolean add(T t);

    boolean add(int index);

    T get(int index);

    T get(T t);

    void set(int index, T t);

    void delete(int index);

    void delete(T t);

    int size();

    void sort();

}
