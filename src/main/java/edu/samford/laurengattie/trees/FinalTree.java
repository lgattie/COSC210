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
public class FinalTree {

    public static void main(String[] args) {
        GenericTree tree = new GenericTree<>("A");
        TreeNode B = tree.addChild(tree.root(), "B");
        TreeNode C = tree.addChild(tree.root(), "C");
        tree.addChild(C, "E");
        tree.addChild(C, "F");
        TreeNode D = tree.addChild(tree.root(), "D");
        System.out.println(tree);
        // remaining code ommitted ... complete as your answer in the answer box
        // ...
    //            GenericTree<String> airports = new GenericTree<>("BHM");
      //  TreeNode<String> atlnode = airports.addChild(airports.root(), "ATL");
      //  airports.addChild(airports.root(), "MSP");
    //    airports.addChild(atlnode, "BOS");
    //    airports.addChild(atlnode, "SFO");
    //    airports.addChild(atlnode, "MCO");
    //    System.out.println(airports);
    
    }
}

