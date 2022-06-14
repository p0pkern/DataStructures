package BinarySearchTree;


public class BST {
	public Node root;
	
	BST(){
		root = null;
	}
	
	public Node search(int target) {
		
		Node current = root;
		
		while(current.data != target) {
			System.out.print(current.data + " ");
			
			if(current.data > target) {
				current = current.left;
			} else {
				current = current.right;
			}
			
			if(current == null) {
				return null;
			}
		}
		
		return current;
	}
	
	public void insert(int value) {
		
		if(root == null) {
			root = new Node(value);
		} else {
			Node current = root;
			Node parent = null;
			
			while(true) {
				parent = current;
				
				if(value < parent.data) {
					current = current.left;
					
					if(current == null) {
						parent.left = new Node(value);
						return;
					}
				} else {
					current = current.right;
					
					if(current == null) {
						parent.right = new Node(value);
						return;
					}
				}
			}
		}
	}

}
