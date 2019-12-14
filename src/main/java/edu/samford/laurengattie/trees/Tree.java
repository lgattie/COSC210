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
public interface Tree<T> {
    public TreeNode<T> root();
    public TreeNode<T> parent(TreeNode<T> node);
    public TreeNode<T>[] children(TreeNode<T> node);
       //these take in PARAMETERS!!!!
    public int depth(TreeNode<T> node); 
    public int size(); // count of all the nodes, count of all the data items 
    public boolean isEmpty(); // is there any data at all, and is there a root node
    public int height(); // helpful in visualizing the structure of the tree, 
    // only problem with that is if there is a crazy outlier or the tree is very unbalanced 
    public TreeNode<T> search(T searchdata);
        /**
     * returns true if ancestornode is in fact an ancestor of node. 
     * @param node
     * @param ancestornode
     * @return
     */
    public boolean ancestor(TreeNode<T> node, TreeNode<T> ancestornode);
    
        /**
     * returns true if descendatnode is in fact a descendant of node. 
     * @param node
     * @param descendantnode
     * @return
     */
    public boolean descendant(TreeNode<T> node, TreeNode<T> descendantnode);
         

}

