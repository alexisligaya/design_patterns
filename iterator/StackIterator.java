package iterator;
import java.util.Stack;
/**
 * The stack iterator for a document is implemented.
 * @author Alexis Peters
 */
public class StackIterator {
    private Stack<String> items;
    private int position;

    /**
     * Creates the stack iterator
     * @param items the stack with strings of document changes
     */
    public StackIterator(Stack<String> items){
        this.items = items;
        this.position = 0;
    }

    /**
     * Checks the next item in the stack
     * @return the next item or null 
     */
    public String next(){
        if(hasNext())
            return items.get(position++);
        return null;
    }

    /**
     * Checks the size of the stack
     * @return true if the stack has more items
     */
    public boolean hasNext(){
        return position < items.size();
    }
}
