package iterator;
import java.util.Stack;
/**
 * A user can make, undo, and redo changes to a document. 
 * @author Alexis Peters
 */
public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /**
     * Creates the undo and redo stack
     * @param title of the document 
     */
    public Document(String title){
        this.title=title;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    /**
     * Adds changes to the stack
     * @param change the user makes to the document 
     * @return displays the changes 
     */
    public String makeChange(String change){
        undoStack.push(change);
        redoStack.clear();
        return "Making Change: " + change;
    }

    /**
     * User is able to undo changes
     * @return the changes that are undone
     * @return null if there are no changes to be undone
     */
    public String undoChange(){
        if(canUndo()){
            String lastEdit = undoStack.pop();
            redoStack.push(lastEdit);
            return "Undoing: " + lastEdit;
        }
        return null;
    }

    /**
     * User can undo changes 
     * @return if the stack is not empty
     */
    public boolean canUndo(){
        return !undoStack.isEmpty();
    }

    /**
     * User is able to redo changes
     * @return the changes that are redone
     * @return null if there are no changes to be redone
     */
    public String redoChange(){
        if(canRedo()){
            String lastChange = redoStack.pop();
            undoStack.push(lastChange);
            return "Redoing: " + lastChange;
        }
        return null;
    }

    /**
     * User can redo changes 
     * @return if the stack is not empty
     */
    public boolean canRedo(){
        return !redoStack.isEmpty();
    }

    /**
     * Updated stack
     * @return the new stack with changes
     */
    public StackIterator getUndoIterator(){
        return new StackIterator(undoStack);
    }
    
    /**
     * Updated stack
     * @return the new stack with changes
     */
    public StackIterator getRedoIterator(){
        return new StackIterator(redoStack);
    }
}
