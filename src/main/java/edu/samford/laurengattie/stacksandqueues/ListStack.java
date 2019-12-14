/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.stacksandqueues;

import edu.samford.laurengattie.lists.DLinkedList;

/**
 *
 * @author laurengattie
 */
public class ListStack<T extends Comparable> implements Stack<T> {

    // Underlying data structure thst stores all the stack items
    // THe "end" of the linked list will be hte "top" of the stack
    protected DLinkedList<T> theStack = new DLinkedList<>();

    @Override
    public void push(T data) {
        theStack.insertLast(data);
    }

    @Override
    public T pop() {
        if (theStack.isEmpty()) {
            throw new Error("You aren't supposed to call pop() on an empty stack. Did you check if the stack was empty first?");
        }
        T data = theStack.last().element();
        theStack.remove(theStack.last());
        return data;
    }

    @Override
    public T top() {
        if (theStack.isEmpty()) {
            throw new Error("You aren't supposed to call top() on an empty stack. Did you check if the stack was empty first?");
        }
        T data = theStack.last().element();
        return data;
    }

    @Override
    public int size() {
        return theStack.size();
    }

    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    @Override
    public String toString() {
        return theStack.toString();
    }

}
