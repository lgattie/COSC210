/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.lists;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author laurengattie
 */
public class DLinkedListIterator<T extends Comparable> implements Iterator<T> {

    protected DLinkedList<T> theList; // the list we are iterrating over
    protected DNode<T> cur;     // keeps up with the current position

    public DLinkedListIterator(DLinkedList<T> theList) {
        this.theList = theList;
        cur = theList.first();
    }

    /**
     * Check to see if there are any nodes to visit.
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return cur != null;
    }

    /**
     * next() should only ever be called after hasNext() has returned true.
     *
     * @return
     */
    @Override
    public T next() {
        T theData = cur.element();
        cur = theList.next(cur);
        return theData;
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Remove the node that was returned the last time next() was called. Note
     * how the special case of removing the last node in the list is handled
     * "cur" will be null after next() is called for the last node so if
     * cur==null what the programmer was trying to do was remove the last node
     * in the list so now we do that for them normally
     */
    @Override
    public void remove() {
        if(cur==null) {
            theList.remove(theList.last());
        } else {
            DNode<T> doomed = theList.prev(cur);
            theList.remove(doomed);
        }
    }

}
