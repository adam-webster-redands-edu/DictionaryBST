package testing;

import webster.Dictionary;

public class DictionaryTester {

    public static void main(String[] args) {
        // Create a dictionary
        Dictionary dictionary = new Dictionary();

        // Add words
        dictionary.insertWordNode("perfect");
        dictionary.insertWordNode("system");
        dictionary.insertWordNode("cleaning");
        dictionary.insertWordNode("room");
        dictionary.insertWordNode("move");
        dictionary.insertWordNode("items");
        dictionary.insertWordNode("place");
        dictionary.insertWordNode("center");
        dictionary.insertWordNode("get");
        dictionary.insertWordNode("rid");
        dictionary.insertWordNode("things");
        dictionary.insertWordNode("used");
        dictionary.insertWordNode("year");
        dictionary.insertWordNode("take");
        dictionary.insertWordNode("trash");
        dictionary.insertWordNode("dirty");
        dictionary.insertWordNode("dishes");
        dictionary.insertWordNode("kitchen");
        dictionary.insertWordNode("sink");
        dictionary.insertWordNode("find");
        dictionary.insertWordNode("location");
        dictionary.insertWordNode("remaining");
        dictionary.insertWordNode("squeeze");
        dictionary.insertWordNode("bed");
        dictionary.insertWordNode("stuff");
        dictionary.insertWordNode("closet");
        dictionary.insertWordNode("easy");

        // Spell checks
        assert dictionary.spellCheck("perfect");
        assert dictionary.spellCheck("room");
        assert !dictionary.spellCheck("xyz");

        // Remove words
        dictionary.removeWord("perfect");
        dictionary.removeWord("room");
        assert !dictionary.spellCheck("perfect");
        assert !dictionary.spellCheck("room");

        // Perform more experiments...

        System.out.println("Successful");
    }
}
