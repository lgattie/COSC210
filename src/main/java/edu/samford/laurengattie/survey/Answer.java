
package edu.samford.laurengattie.survey;

import java.util.Scanner;

/**
 * Represents the answer to a single survey question.
 *
 * @author laurengattie
 */
public class Answer {
    // Attributes
    // What two things do we need to store? Number & String.
    protected Question q;                   // reference to the question being answered
    protected int scaleResponse;            // user selected response... should be within q's range
    protected String additionalResponse;    // user comments

    /**
     * Convenience constructor that provides some meaningful defaults.
     */
    public Answer(Question q) {
        this.q = q;
        this.scaleResponse = q.minScale;
        this.additionalResponse = "N/A";

    }
/**
 * Retrieve the answer to the scale question from stdin (i.e., the keyboard)
 * and store that answer in the scaleResponse attribute.
 * @param stdin 
 */
    public void getScaleResponse(Scanner stdin) {
        // 1. Get the user response (for the scale prompt)
        // 2. Check the response to make sure it is within the question's range
        // 3. If not, tell the user and display error message and go back to step 1
                                // Choosing between the different types of loops
                                // For is over kill
                                // Do while is rare but useful when you only want your code to run at least once
        do {
            this.scaleResponse = Integer.parseInt(stdin.nextLine()); 
            // this statement with the equal sign is called and assignment statement 
            // basically sayig evaluate the entire right hand side and then assigning it to the new left hand varaible ---- it's a commmand 
            // important if you are mixing string and integer data
            // don't do this:
            // if (scaleResponse<q.minscale || scaleResponse>q.maxscale) you are doing the work here
            
            if (!q.checkResponse(scaleResponse)){
                System.out.println("Please try again. Input outside valid range.");
            }
                
        } while (!q.checkResponse(scaleResponse));
        
    }
    
 /**
 * Retrieve the answer to the additional comments question from stdin (i.e., the keyboard)
 * and store that answer in the additionalResponse attribute.
 * @param stdin 
 */
    public void getAdditionalResponse(Scanner stdin) {
        this.additionalResponse = stdin.nextLine();
        
    }
}
