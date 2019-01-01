package list;

import intNode.Node;

public class LinkedListClient {

	public static void main(String[] args) {
		LinkedList test1 = new LinkedList(new Node(1));
		test1.print();
		for (int i = 2; i < 11; i++) {
			test1.add(i);
		}
		test1.print();
		
		test1.insert(0, 5);
		test1.print();
		
		test1.delete(6);
		test1.print();
		
		test1.insert(0, 0);
		test1.print();
		
		test1.delete(1);
		test1.print();
		
		test1.insert(0, 10);
		test1.print();

		test1.add(11);
		test1.print();

		test1.delete(12);
		test1.print();

//		test1.insert(0, -1);
//		test1.print();
		
//		test1.delete(-1);
//		test1.print();
		
		test1.insert(0, 20);
		test1.print();

	}

}

