/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.iterators;

import edu.samford.laurengattie.lists.DLinkedList;
import java.util.Iterator;

/**
 *
 * @author laurengattie
 */
public class ListIteratorDemo {

    public static void main(String[] args) {
        DLinkedList<Integer> highs = new DLinkedList<>();
        //how you create a new linked list
        highs.insertLast(100);
        highs.insertLast(99);
        highs.insertLast(102);
        highs.insertLast(95);
        highs.insertLast(97);

        Iterator<Integer> it = highs.iterator();
        int total = 0;
        while (it.hasNext()) {
            Integer temp = it.next();
            total += temp;

        }
        double average = (double) total / highs.size();

        total = 0;
        for (Integer high : highs) {
            total += high;
        }
        double average2 = total / highs.size(); //incorrct because without casting one side or the other side to a double,
        // Java performs truncation division because it throws away the remainder

        System.out.println("Avg: " + average);
        System.out.println("Avg2: " + average2);
    }
}
