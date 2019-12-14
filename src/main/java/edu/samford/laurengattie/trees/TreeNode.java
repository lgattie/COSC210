/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.trees;

/**
 *
 * @author laurengattie
 */
public interface TreeNode<T> {
    public T element(); // returns reference to the data we are storing
    public TreeNode<T> parent (); // returns eference to the parent NODE
    public TreeNode<T>[] children(); // returns an array of child NODE references 
    // vertical version of prev and next 
    public boolean isLeaf(); // leaf node is a node that has no children
    
}
