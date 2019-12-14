/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.fun;

import edu.samford.laurengattie.trees.BST;
import edu.samford.laurengattie.trees.BST;
import edu.samford.laurengattie.trees.BinaryTreeImpl;
import edu.samford.laurengattie.trees.BinaryTreeImpl;
import edu.samford.laurengattie.trees.BinaryTreeNode;
import edu.samford.laurengattie.trees.BinaryTreeNode;

/**
 *
 * @author laurengattie
 */
public class BTest {
    public static void main(String[] args) {
        BinaryTreeImpl<String> test = new BinaryTreeImpl<>("BHM");
        BinaryTreeNode<String> root = (BinaryTreeNode<String>)test.root();
        System.out.println(test);
        BinaryTreeNode<String> atlnode = test.setLeft(root, "ATL");
        test.setRight(root, "MSP");
        System.out.println(test);
        test.setRight(atlnode,"AAA");
        System.out.println(test);
        test.setRight(root,"ARK");
        System.out.println(test);
        
        BST<String> bst = new BST<>("BHM");
        System.out.println(bst);
        bst.add("ATL");
        System.out.println(bst);
        bst.add("MSP");
        bst.add("AAA");
        bst.add("SMF");
        bst.add("SFO");
        System.out.println(bst);
        
        bst.rebalance();
        
        System.out.println(bst);
    }
}
