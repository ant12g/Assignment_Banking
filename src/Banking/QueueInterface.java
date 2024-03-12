package Banking;

interface QueueInterface<T extends ComparableInterface> {
    void add(T item);

    T remove();

    T peek();

    boolean isEmpty();

    int getSize();

    void clear();

    interface PriorityQueueInterface<T extends ComparableInterface<? super T>> {
        void add(T newEntry);
        T remove();
        T peek();
        boolean isEmpty();
        int getSize();
        void clear();
    }
}
