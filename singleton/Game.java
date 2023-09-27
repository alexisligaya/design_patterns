package singleton;
import java.util.Random;
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
        this.level = Difficulty.EASY; //?
        this.anagrams = new HashMap<>();
        this.score = 0;
    }

    public static Game getInstance(){
        if (instance == null){
            instance = new Game();
        }
        return instance;
    }

    public String getQuestion(){
        return question;
    }

    public boolean isCorrect(String userAnswer){
        return answers.contains(UserAnswer);
    }

    public int getScore(){
        return score;
    }

}
