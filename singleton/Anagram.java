package singleton;
import java.util.ArrayList;

public class Anagram {
 
    private String question;
    private ArrayList<String> answers;

    public Anagram(String question, ArrayList<String> answer){
        this.question = question;
        this.answers = new ArrayList<>(answers);
    }

    public String getQuestion(){
        return question;
    }

    public boolean isCorrect(String userAnswer){
        return answers.contains(userAnswer.toLowerCase());
    }

}