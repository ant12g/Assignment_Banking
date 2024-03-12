
/*************************************************
 File: Assignment_Banking
 By: Antonio Gonzalez
 Date: 03/12/2024
 Description: Assignment 2 banking application.

 *************************************************/
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
