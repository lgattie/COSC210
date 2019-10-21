/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.stacksandqueues;

/**
 *
 * @author laurengattie
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> urls = new ArrayStack<>();
        // urls is currently empty, our browser is on the home page
        System.out.println("stack size: " + urls.size());
        
        // user navigates to samford.edu
        // we push the home page onto the stack
        urls.push("home page");
        
        //user navigates to bsc.edu
        // we push saford.edu onto the stack
        // stack size should be two
        urls.push("samford.edu");
        System.out.println("stack size: "+ urls.size());
        
        String url = urls.pop();
        System.out.println(url);
        
        url = urls.pop();
        System.out.println(url);
        
        // this next line should crash the program
         // url = urls.pop();
    }
}
