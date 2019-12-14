/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.fun;

//import edu.samford.laurengattie.stacksandqueues.ListQueue;
//import edu.samford.laurengattie.stacksandqueues.ListStack;
//import edu.samford.laurengattie.stacksandqueues.Queue;
//import edu.samford.laurengattie.stacksandqueues.Stack;
/**
 *
 * @author laurengattie
 */
public class ExampleStack {

    public static void main(String args[]) {
        System.out.println(printAnswer(3, 4));
    }

    public static int printAnswer(int num1, int num2) {
        int ans;
        if (num1 >= num2) {
            ans = num1 - num2;
        } else {
            ans = num1 + num2;
        }
        return ans;

    }

}
