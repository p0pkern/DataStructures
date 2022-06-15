package LinkedList;

public class LinkedList {
	private Node head;
	
	LinkedList(){
		head = null;
	}
	
	public void addNode(int value) {
		
		Node current = head;
		
		if(current == null) {
			head = new Node(value);
		} else {
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = new Node(value);
		}
	}
	
	public void search(int target) {
		
		Node current = head;
		int index = 0;
		
		if(current == null) {
			System.out.println("No Linked Nodes");
		} else if (current.data == target){
			System.out.println(current.data + " is found at index: " + index);
		} else {
			while(current != null) {
				if(current.data == target) {
					break;
				}
				index++;
				current = current.next;
			}
			
			if(current != null) {
				System.out.println(current.data + " is found at index: " + index);
			} else {
				System.out.println("Node not found.");
			}
		}
	}
	
	public void printAllNodes() {
		
		Node current = head;
		int counter = 0;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
			
			if(counter == 10) {
				System.out.println();
				counter = 0;
			}
			
			counter++;
		}
		System.out.println();
	}
	
	public void delete(int target) {
		
		Node current = head;
		int index = 0;
		
		if(current == null) {
			System.out.println("Linked List is empty");
		} else if (current.data == target) {
			head = current.next;
			System.out.println("Node at index 0 " + target + " removed.");
		} else {
			Node parent = null;
			
			while(current != null) {
				parent = current;
				
				if(current.data == target) {
					break;
				}
				current = current.next;
				index++;
			}
			
			parent.next = current.next;
			System.out.println("Node at index " + index + " " + target + " removed.");
		}
	}
}
