
public class MyLinkedList{

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		
		list.append("gay");
		list.append("lol");
		list.append("ur mom");
		list.append("ha");

		list.head.next = list.head.next.next;
		
		Node current = list.head;
		
		while(current != null) {
					
			System.out.println(current + " " + current.data);
			current = current.next;
			
		}
		
		
		
			
	}
	
	public static class Node {
		Node next;
		String data;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
		
	Node head;
		
	public void append(String data) {
		
		if(head == null) {
			head = new Node(data);
			return;

		}
		
		Node current = head;
		while(current.next != null) {
			current= current.next;
		}
		current.next = new Node (data);
	}
	
	public void prepend(String data) {
		Node newHead  = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(String data) {
		
		if(head == null) return;
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

}
