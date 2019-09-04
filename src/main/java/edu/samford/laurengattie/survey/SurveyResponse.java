/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.survey;

/**
 *
 * @author laurengattie
 */
public class SurveyResponse {

    //Attributes
    protected Answer[] answers;
    protected int numAnswers;
    
    public SurveyResponse(int size) {
        this.numAnswers = 0;
        this.answers = new Answer[size];
        
    }
    
}
