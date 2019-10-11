/** Operations required for a Stack.
 * LIFO - last in, first out
 * push - add an item to the top of the stack
 * pop - remove an item from the top of the stack
 * top - return the top of the stack without removing it
 * isEmpty - return true or false whether or not there are any items in the set
 * size - return the number of items in the stack
 * no insert, remove methods ONLY can use the ones listed above
 */
package edu.samford.laurengattie.stacksandqueues;

/**
 *
 * @author laurengattie
 */
public interface Stack<T> {
    
    public void push(T data); // COLON at the end is different than a class
    public T pop();
    public T top();
    public int size();
    public boolean isEmpty();
    
    
    // Stack is more limiting than an array or a linked list
    // Limitation: can only add and remove items in a specific order
    // Stack enforces the ordering! Not left up to the programmer. 
    // Ex: Stack pops up when thre is an error and it goes through the methods called before the error occured
    // Ex: forward and back buttons 
    
    // 1st Interface we are designing & we want it to be genaric
    // When designing and interface you have to put in all of the signatures 
    
}
