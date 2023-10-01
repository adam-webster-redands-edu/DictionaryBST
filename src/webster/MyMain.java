package webster;

public class MyMain {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // Add words
        dictionary.insertWordNode("apple");
        dictionary.insertWordNode("banana");
        dictionary.insertWordNode("cherry");

        // Spell check
        System.out.println(dictionary.spellCheck("banana")); // Output: true
        System.out.println(dictionary.spellCheck("orange")); // Output: false

        // Remove word
        dictionary.removeWord("banana");
        System.out.println(dictionary.spellCheck("banana")); // Output: false
    }
}
