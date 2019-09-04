/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.survey;

/**
 * Represents a survey of Questions. 
 * @author laurengattie
 */
public class Survey {
    // Attributes
    protected Question[] questions;
    protected int numQuestions;     // size of our survey in terms of the number of questions
    
    // Default Constructor
    public Survey() {
        this(10); // defaults to an array with room for 10 questions
    }
    
    public Survey(int size){
        this.numQuestions = 0;
        questions = new Question[size];
        
    }
    
    /**
     * Adds a new question to our array of questions using the given prompt and 
     * all of the other defaults for a Question.
     */
    public void addQuestion(String prompt){
        // 1. Create the question
        Question q = new Question (prompt);
        
        // 2. Add the question to the "end" of our array
        questions[numQuestions++] = q;
        //number that goes inside the bracket called the index (position within the array)
        
        
        // Problems with array
        // Don't know the size of the array, you have the capacity but not how many you've already used
        // Hard to change the size
            
    }
   /**
    * Asks all the questions in the survey and gets
    * answers to each question and puts all the answers into a new
    * SurveyResponse object.
    * @return the newly created response with all the answers 
    */ 
    public SurveyResponse conduct () {
        // 1. Create the new empy SurveyResponse
        SurveyResponse response = new SurveyResponse(this.questions.length);
        // 2. Repeat the following for all questions:
        //          a. Ask a question (both parts)
        //          b. Get the answers (both parts)
        //          c. Add the answer to the SurveyResponse
        // 3. return the now-completed response
        
        return response;
    }
    
   
}
