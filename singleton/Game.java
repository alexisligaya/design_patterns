package singleton;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

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
    }

    public static Game getInstance(){
        if (game == null){
            game = new Game();
        }
        return game;
    }

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
        return randAnagram.getQuestion(); //?
    }

    public boolean isCorrect(String userAnswer){
        return currentAnagram.isCorrect(userAnswer);
    }

    public int getScore(){
        //update score?
        score ++;
        return score;
    }

}
