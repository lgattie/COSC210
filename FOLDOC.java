/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.briantoone.fun;

import edu.samford.briantoone.lists.DLinkedList;
import edu.samford.briantoone.trees.BST;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kartoone
 */
public class FOLDOC {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner filein = new Scanner(new File("Dictionary.txt"));
        String currentTerm = "";
        String currentDefinition = "";
        DLinkedList<FOLDOCTerm> list = new DLinkedList<>();
        while(filein.hasNextLine()) {
            String nextLine = filein.nextLine();
            if (nextLine.trim().equals("")) {
                // we must be still going with the current definition
                currentDefinition += "\n";
            } else if (nextLine.charAt(0)=='\t') {
                // we must have a blank line ... let's add it to the definition
                currentDefinition += nextLine.trim() + "\n";
            } else {
                // we must have encountered a new term
                // so...
                //   1. Add the old term (if there was one) to our data structure(s)
                if (!currentTerm.equals("")) {
                    FOLDOCTerm newterm = new FOLDOCTerm(currentTerm.trim(), currentDefinition.trim());
                    list.insertLast(newterm);
                }
                
                //   2. Grab the new term
                currentTerm = nextLine.trim();
                
                //   3. Reset the current definition
                currentDefinition = "";
            }
        }
        System.out.println(list);
    }
}
