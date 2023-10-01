package webster;

public class WordNode {

	//DATA MEMBERS
	public String word;
	public WordNode left;
	public WordNode right;
	
	
	//CONSTRUCTOR
	public WordNode (String word) {
		this.word = word;
		left = null;
		right = null;
	}
	
	public String toString() {
		return word;
	}
}
