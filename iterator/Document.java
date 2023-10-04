package iterator;
import java.util.Stack;

public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public Document(String title){
        this.title=title;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public String makeChange(String change){
        undoStack.push(change);
        redoStack.clear();
        return "Making Change: " + change;

    }

    public String undoChange(){
        if(canUndo()){
            String lastEdit = undoStack.pop();
            redoStack.push(lastEdit);
            return "Undoing: " + lastEdit;
        }
        return null;
    }

    public boolean canUndo(){
        return !undoStack.isEmpty();
    }

    public String redoChange(){
        if(canRedo()){
            String lastChange = redoStack.pop();
            undoStack.push(lastChange);
            return "Redoing: " + lastChange;
        }
        return null;
    }

    public boolean canRedo(){
        return !redoStack.isEmpty();
    }

    public StackIterator getUndoIterator(){
        return new StackIterator(undoStack);
    }

    public StackIterator getRedoIterator(){
        return new StackIterator(redoStack);
    }
}
