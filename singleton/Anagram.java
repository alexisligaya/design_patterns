package singleton;
import java.util.ArrayList;

/**
 * A anagram game is created and filled with the words. 
 * @author Alexis Peters
 */
public class Anagram {
 
    private String question;
    private ArrayList<String> answers;

     /**
     * Creates a anagram with possible questions and answers
     * @param question The anagram questions
     * @param answers The list of possible correct answers 
     */
    public Anagram(String question, ArrayList<String> answers){
        this.question = question;
        this.answers = new ArrayList<>(answers);
    }

     /**
     * Creates the questions
     * @return returns the word for the user to enter the anagram for 
     */
    public String getQuestion(){
        return question;
    }

     /**
     * Checks whether the user's answer is in the list of correct options
     * @param userAnswer the user's answer to the provided word
     * @return returns whether the user's answer is correct
     */
    public boolean isCorrect(String userAnswer){
        return answers.contains(userAnswer.toLowerCase());
    }

}