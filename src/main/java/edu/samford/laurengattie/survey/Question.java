package edu.samford.laurengattie.survey;

/**
 * Represents a question in our survey. 
 * @author laurengattie
 */
public class Question {
    // Attributes
    protected String prompt;        // the message displayed to the user when the question is asked
    protected int minScale;         // minimum respose value inclusive
    protected int maxScale;         // maximum respose value inclusive
    protected String secondPrompt;  // the prompt in front of the open ended section of the question
    
    
    // Contructors
    /**
     * Initialize to some meaningful defaults.
     */
    public Question(){
        // This is the default constructor b/c it takes no parameters
        prompt = "Please enter something:";
        minScale = 1;
        maxScale = 10;
        secondPrompt = "Additional comments.";    
    }
    
    /** 
     * Use the given prompt with all the other default attributes.
     */
    
    public Question(String prompt) {
        this();
        //Goes up and calls what is being intialized (ie the default contructor that takes no parameters
        //any time you see the () you are calling a method
        this.prompt = prompt;
        
    }
    
    /**
     * Construct a question with these specific attributes.
     */
    
    public Question (String prompt, int minScale, int maxScale, String secondPrompt) {
        this.prompt = prompt;
        this.minScale = minScale;
        this.maxScale = maxScale;
        this.secondPrompt = secondPrompt;
        
    }
    /**
     * Displays the prompt for the main question.
     */
    public void display() {
        System.out.println(prompt + "[" + minScale + "-" + maxScale + "] ");
    }
    /**
     * Displays the second prompt for the main question.
     */
    public void displaySecond () {
        System.out.println(secondPrompt);
    }
    // same name as the class but does NOT return anything
    // this is called a default constructor b/c it doesn't take parameters
    
    
    //attributes start with lower case letter,  then camel case the rest of it 
    
    // when creating a method: public/private/protected TYPE NAME;
            // difference between this and private has to do with classes extending to other classes 
            // private is a dead end 
    
    /**
     * Returns true if the given response is within the range. 
     * @param scaleResponse
     * @return 
     */
    public boolean checkResponse (int scaleResponse){
        return scaleResponse >=minScale && scaleResponse <= maxScale;
        
    }
}
