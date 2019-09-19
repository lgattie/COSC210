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
public class SNode {
    
    // Attributes
    protected String e; // stands for element (i.e., data) stored at this node
    protected SNode next; // the "link" (i.e., reference) to the next node
    
    
    public SNode(String e, SNode next){
        this.e = e;
        this.next = next;
        
    }
    
    public SNode getNext(){
        return next;
    }
    
    public void setNext(SNode next){
        this.next = next;
    }
    
    public String element(){
        return e;
    }
    
    public void setElement(String e){
        this.e =e;
    }
}
