/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.survey;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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

    /**
     * Record the answer into our answers array.
     *
     * @param answer
     */
    public void addAnswer(Answer answer) {
        answers[numAnswers++] = answer;
    }

    /**
     * Writes the survey response answers out to a file in this format:
     * 7| I know this topic pretty well.
     * 1| I have no idea what that is.
     * 10| I have written a bunch of program that do File I/O
     * @param filename
     * @throws FileNotFoundException 
     */
    public void save(String filename) throws FileNotFoundException {
        File f = new File(filename);            // create a reference to a file 
        PrintWriter out = new PrintWriter(f);   // these two statements have to be here
        
        for (int i = 0; i < numAnswers; i++) {
            Answer answer = answers[i];
            out.println(answer.scaleResponse + "|" + answer.additionalResponse);
        }
        //File only references the metadata of the file, but dont actually have access to that file
        //Have to pass it through something else to actually see whats stored there
        
        out.close();
        
    }

}
