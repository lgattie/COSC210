/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.survey;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author laurengattie
 */
public class SurveyResults {

    // Attributes
    protected Survey survey;
    protected SurveyResponse responses[];
    protected int numResponses;
    public static int MAXFILES = 100; // assume that we will never have more than a hundred survey responses

    public SurveyResults(Survey survey) {
        this.survey = survey;
        this.numResponses = 0;
        this.responses = new SurveyResponse[MAXFILES];
    }

    /**
     * Read all of the responses from text files in the given directory.
     *
     * @path The relative path where all the responses are stored.
     */
    public void readResponses(String path) throws FileNotFoundException {
        File dir = new File(path);
        File files[] = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {   // couldnt use fore loop if you are going to rearrange the order of the files, 
                // or if you need the position of the file in the array at all
                Scanner filein = new Scanner(file);
                SurveyResponse response = new SurveyResponse(survey.numQuestions);
                int qi = 0;// currrent question number (index)

                while (filein.hasNextLine()) {
                    String line = filein.nextLine();
                    String parts[] = line.split("\\|");
                    if (parts.length!=2){
                        continue;
                    }
                    int scaleResponse = Integer.parseInt(parts[0]);
                    Answer answer = new Answer(survey.questions[qi], scaleResponse, parts[1]);
                    qi++; // advance to the next question 
                    response.addAnswer(answer);
                    responses[numResponses++] = response;

                }
                responses[numResponses++] = response;
            }

        }
    }

    /**
     * Process all the responses by calculating the averages and joining all of
     * the freeform responses with pipes
     */
    public void processResponses() {
        // Data we need for the calculations
        double totals[] = new double[survey.numQuestions];
        double averages[] = new double[survey.numQuestions];
        String comments[] = new String[survey.numQuestions];
        
        for(SurveyResponse response : responses){
            if (response!=null)
            for (int qi = 0; qi < response.numAnswers; qi++) {
                totals[qi] += response.answers[qi].scaleResponse;
                comments[qi] += "|" + response.answers[qi].additionalResponse;
                
            }
        }
        // Calculate the averages by dividing all totals by the number of responses.
        for(int ti=0; ti<totals.length; ti++){
            totals[ti] = totals[ti] / numResponses;
            
        }
        
        for (int qi=0; qi<survey.numQuestions; qi++){
            Question q = survey.questions[qi];
            System.out.println(q.prompt + " - " + totals[qi] + " - " + comments[qi]);
        }
    }

}    // end of SurveyResults


// if you see void look for the side effect even though it isn't actually "returning" anything
