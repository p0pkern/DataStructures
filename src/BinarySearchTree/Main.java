package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.insert(12);
		bst.insert(11);
		bst.insert(13);
		System.out.println(bst.search(13).data);

	}

}
