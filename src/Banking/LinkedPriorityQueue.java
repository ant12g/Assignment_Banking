package Banking;

public class LinkedPriorityQueue<T extends ComparableInterface<ComparableInterface>> implements QueueInterface<T> {

    LinkedList<T> queue;

    public LinkedPriorityQueue(){
        this.queue = new LinkedList<>();
    }

    @Override
    public void add(T item) {
        if (queue.isEmpty()) {
            queue.add(item);
        } else {
            boolean added = false;
            for (int i = 0; i < queue.size(); i++) {
                if (item.compareTo(queue.get(i)) < 0) {
                    queue.add(i, item);
                    added = true;
                    break;
                }
            }
            if (!added) {
                queue.addLast(item);
            }
        }
    }

    @Override
    public T remove() {
        return queue.poll();
    }

    @Override
    public T peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int getSize() {
        return queue.size();
    }
    @Override
    public void clear() {
        queue.clear();
    }
}



