package edu.samford.laurengattie.stacksandqueues;

import edu.samford.laurengattie.lists.DLinkedList;

/**
 *
 * @author laurengattie
 */
public class ListQueue<T> implements Queue<T> {

    protected DLinkedList<T> theQueue = new DLinkedList<>();

    @Override
    public void enqueue(T data) {
        theQueue.insertLast(data);
    }

    @Override
    public T dequeue() {
        if (theQueue.isEmpty()) {
            throw new Error("cannot remove from an empty queue. Did you check to see thaat you called isEmpty first??");
        }
        T data = theQueue.first().element();
        theQueue.remove(theQueue.first());
        // save it as a local variable becasue we can't return anything if we don't save it first
        return data;
    }

    @Override
    public T front() {
        if (theQueue.isEmpty()) {
            throw new Error("This method does not work with an empty queue. Cannot retrieve the first item from an empty queue. Did you check to see thaat you called isEmpty first??");
        }
        T data = theQueue.first().element();
        return data;
    }

    @Override
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    @Override
    public int size() {
        return theQueue.size();
    }

    @Override
    public String toString() {
        String strval = theQueue.toString();
        return strval;
    }

}
