/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.lists;

/**
 *
 * @author laurengattie
 */
public class SNode<T> {

    // example when using the data type int SNode<Integer>
    // Attributes
    protected T e; // stands for element (i.e., data) stored at this node
    protected SNode<T> next; // the "link" (i.e., reference) to the next node

    public SNode(T e, SNode<T> next) {
        this.e = e;
        this.next = next;

    }

    public SNode getNext() {
        return next;
    }

    public void setNext(SNode<T> next) {
        this.next = next;
    }

    public T element() {
        return e;
    }

    public void setElement(T e) {
        this.e = e;
    }
}
