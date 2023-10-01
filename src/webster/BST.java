package webster;
public class BST {
	
	//CLASS ATTRIBUTE
	public WordNode root;
	
	//CONSTRUCTOR
	public BST() {
		root = null;
	}
	
	public void addNode(String word) {
		//TASK 1: CREATE A NODE
		WordNode temp = new WordNode (word);
		
		
		//SCENARIO 1: IF THE TREE IS EMPTY, ADD IT TO THE ROOT
		if (root == null) {
			root = temp;
		}
			
		//SCENARIO 2: LOCATE THE CORRECT POSITION TO ADD IT.
		else {
			insert(root, temp);
		}
	}
	
	private void insert (WordNode myRoot, WordNode temp) {
		
		while (true) {
			
			//SCENARIO 1: IGNORE DUPLICATE WORDS
			if (temp.word.compareToIgnoreCase(myRoot.word) == 0)
				return;
			
			//SCENARIO 2: NAVIGATE TO THE LEFT NODE
			if (temp.word.compareToIgnoreCase(myRoot.word) <= -1) {
				if (myRoot.left != null)
					myRoot = myRoot.left;
				else {
					myRoot.left = temp;
					break;
				}
			}
			
			//SCENARIO 3: NAVIGATE TO THE RIGHT NODE
			else {
				if (myRoot.right != null)
					myRoot = myRoot.right;
				else {
					myRoot.right = temp;
					break;
				}
			}
		}
	}
	
	public void inOrder() {
		inOrderRecursive (root);	
	}
	
	private void inOrderRecursive (WordNode myRoot) {
		if (myRoot != null) {
			inOrderRecursive(myRoot.left);
			System.out.println(myRoot);
			inOrderRecursive(myRoot.right);
		}
	}
	// METHOD TO CHECK IF A WORD IS PRESENT IN THE BST
    public boolean search(String word) {
        return searchRecursive(root, word);
    }

    private boolean searchRecursive(WordNode myRoot, String word) {
        if (myRoot == null) {
            return false;
        }

        int comparisonResult = word.compareToIgnoreCase(myRoot.word);

        if (comparisonResult == 0) {
            return true;
        } else if (comparisonResult < 0) {
            return searchRecursive(myRoot.left, word);
        } else {
            return searchRecursive(myRoot.right, word);
        }
    }

    // METHOD TO DELETE A NODE
    public void deleteNode(String word) {
        root = deleteRecursive(root, word);
    }

    private WordNode deleteRecursive(WordNode myRoot, String word) {
        if (myRoot == null) {
            return null;
        }

        int comparisonResult = word.compareToIgnoreCase(myRoot.word);

        if (comparisonResult < 0) {
            myRoot.left = deleteRecursive(myRoot.left, word);
        } else if (comparisonResult > 0) {
            myRoot.right = deleteRecursive(myRoot.right, word);
        } else {
            if (myRoot.left == null) {
                return myRoot.right;
            } else if (myRoot.right == null) {
                return myRoot.left;
            }

            myRoot.word = findMin(myRoot.right).word;
            myRoot.right = deleteRecursive(myRoot.right, myRoot.word);
        }

        return myRoot;
    }

    private WordNode findMin(WordNode myRoot) {
        while (myRoot.left != null) {
            myRoot = myRoot.left;
        }
        return myRoot;
    }

}
