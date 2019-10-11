/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.iterators;

/**
 *
 * @author laurengattie
 */
public class ArrayIteratorDemo {
    public static void main(String[] args) {
        //int highs[] = new int[5];
       // highs[0] = 100;
       // highs[1] = 95;
       // different way of doing the same thing as above
       int highs[] = new int[] {100, 95, 96, 97, 98};
        for (int high : highs) {
            System.out.println(high);
        }
        System.out.println(highs[4]);
        System.out.println(highs[5]); // will throw IndexOutOfBoundsException
        
       // LinkedList<Integer> lows = new LinkedList<>();
       // for (Object low : lows) {
            
            
        }
    
}
