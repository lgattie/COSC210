
package edu.samford.laurengattie.stacksandqueues;

/**
 * Interface for a FIFO (First In First Out) data structure. 
 * @author laurengattie
 */
public interface Queue<T> {
    public void enqueue(T data);
    public T dequeue();
    public T front();
    public boolean isEmpty();
    public int size();
}
