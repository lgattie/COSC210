/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.lists;

/**
 * @param <T> type param for this class
 * @author laurengattie
 */
public class SLinkedList<T> {

    // Attributes
    protected int size; // how many items are in the list
    protected SNode<T> head;
    protected SNode<T> tail;

    public SLinkedList() {
        size = 0;
        head = null;
        tail = null;

        // all of this is unnecessary but just to be clear on what all of them are!    
    }

    public void addFirst(SNode newnode) {
        // First, before we fogret, increment the size
        size++;

        // Now, the order matters here, tell the newnode that its next should be head
        newnode.setNext(head);

        // Update the head to reference the newly "added" node
        head = newnode;

        // Lastly, do something with thte tail, only if the link has only one item in the list
        if (size == 1) {
            tail = newnode;
        }
    }

    public SNode<T> addFirst(T newdata) {
        // Create the Snode to store our data
        SNode<T> newnode = new SNode<>(newdata, null);
        addFirst(newnode);
        return newnode;
    }

    public void addLast(SNode newnode) {
        // First, before we fogret, increment the size
        size++;

        // Now, the order matters here, tell the newnode that its next should be the tail
        tail.setNext(newnode);

        // Update the tail to reference the newly "added" node
        tail = newnode;

        // Lastly, do something with the head, only if the link has only one item in the list
        if (size == 1) {
            head = newnode;
        }
    }

    public SNode<T> addLast(T newdata) {
        // Create the Snode to store our data
        SNode<T> newnode = new SNode<>(newdata, null);
        addLast(newnode);
        return newnode;
    }

    /**
     * Adds newnode to our list AFTEr the pos node
     *
     * @param pos
     * @param newnode
     */
    public void addAfter(SNode pos, SNode newnode) {
        size++;
        newnode.setNext(pos.getNext());
        if (pos == tail) {
            tail = newnode;
        }

    }

    public SNode<T> addAfter(SNode pos, T newdata) {
        SNode newnode = new SNode<>(newdata, null);
        addAfter(pos, newnode);
        return newnode;

    }

    /**
     * Searches the entire linked list until searchdata is found.
     *
     * @param
     * @return the SNode containing the searchdata or null if not found.
     */

    public SNode<T> find(T searchdata) {
        SNode<T> cur = head;
        while (cur != null) {
            if (cur.element().equals(searchdata)) {
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }
/**
 * Finds and removes the FIRST occurrence of the given data.
 * @param searchdata
 * @return the removed node if found otherwise null
 */
    public SNode<T> remove(T searchdata){
        SNode<T> doomed = find(searchdata);
        if (doomed!=null){
            remove(doomed);
        }
        return doomed;
    }
            
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override //notation that says yes i understand i am overriding a built in method
    public String toString() {
        String out = "";
        SNode<T> cur = head;
        while (cur != null) {
            out += cur.element();
            // way to fix the hanging comma problem, no clean way of dealing with this problem
            cur = cur.getNext();
            if (cur != null) {
                out += ',';
            }
        }

        return out;
    }

    private void remove(SNode<T> doomed) {
        //difficult to implement 
    }

}
