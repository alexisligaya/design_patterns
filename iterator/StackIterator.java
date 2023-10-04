package iterator;
import java.util.Stack;

public class StackIterator {
    private Stack<String> items;
    private int position;

    public StackIterator(Stack<String> items){
        this.items = items;
        this.position = 0;
    }

    public String next(){
        if(hasNext())
            return items.get(position++);
        return null;
    }

    public boolean hasNext(){
        return position < items.size();
    }
}
