package LinkedList;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		
		for(int i = 0; i < 10; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			linkedList.addNode(randomNum);
		}
		
		linkedList.printAllNodes();
		linkedList.search(2);
		linkedList.delete(2);
		linkedList.printAllNodes();
	}

}
