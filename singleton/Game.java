package singleton;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * A anagram game is created and filled with the words. 
 * @author Alexis Peters
 */
public class Game {

    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game(){
        this.rand = new Random();
        this.level = Difficulty.EASY; 
        this.anagrams = new HashMap<>();
        this.score = 0;

        anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
        anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
        anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
    }

    /**
     * Checks that there is an instance of the game
     * @return returns a instance of the game class
     */
    public static Game getInstance(){
        if (game == null)
            game = new Game();
        return game;
    }

    /**
     * Looks for a random question from the anagram txt files.
     * @return returns a random anagram based on the level
     */
    public String getQuestion(){

        ArrayList<Anagram> anagramsPerLevel = anagrams.get(level);

        //create a random number between 0 and the length of the arraylist
        int randIndex = rand.nextInt(anagramsPerLevel.size());

        //get a random anangram
        Anagram randAnagram = anagramsPerLevel.get(randIndex);

        //set the current anagram to the random one
        currentAnagram = anagramsPerLevel.get(randIndex);

        //remove it from the list
        anagramsPerLevel.remove(randIndex);

        //return the question for the anagagram
        return randAnagram.getQuestion(); 
    }

    /**
     * Compares user's answer to check if it is a valid anagram
     * @param userAnswer The user's answer to the question
     * @return whether the answer is correct
     */
    public boolean isCorrect(String userAnswer){
            if(score == 6 && currentAnagram.isCorrect(userAnswer))
                level = Difficulty.MEDIUM; //level increases after user's score reaches 6

            if(score == 10 && currentAnagram.isCorrect(userAnswer))
                level = Difficulty.HARD; //level increases after user's score reaches 10

            if(currentAnagram.isCorrect(userAnswer))
                score++; //update score
            
        return currentAnagram.isCorrect(userAnswer);
    }

    /**
     * Retrieves the user's score
     * @return the user's updated score
     */
    public int getScore(){
        return score;
    }

}
