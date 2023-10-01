package webster;

public class Dictionary {
    // CLASS ATTRIBUTE
    private BST bst;
    
    // CONSTRUCTOR
    public Dictionary() {
        bst = new BST();
    }
    
    // METHOD TO ADD A WORD TO THE DICTIONARY
    public void insertWordNode(String word) {
        bst.addNode(word);
    }
    
    // METHOD TO CHECK IF A WORD IS SPELLED CORRECTLY
    public boolean spellCheck(String word) {
        return bst.search(word);
    }
    
    // METHOD TO REMOVE A WORD FROM THE DICTIONARY
    public void removeWord(String word) {
        bst.deleteNode(word);
    }
}
