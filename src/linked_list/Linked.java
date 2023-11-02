package linked_list;

public class Linked {
	Node head;
	
	
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public Linked addNode(int element, Linked list) 
	{
		Node newNode = new Node(element);
		newNode.next = null;
		
		if(head == null) 
			{
			list.head = newNode;
			}
		else
			{
				Node last = list.head;
				while(last.next != null)
				{
					last = last.next;
				}
			
				last.next = newNode;
			}
	return list;
	}

	
	public void display (Linked list)
	{
		Node current_node = list.head;
		
		System.out.println("Linked List = ");
		
		while(current_node.next != null)
		{
			System.out.println(current_node.data + ' ');
			
			current_node = current_node.next;
		}
	}
	
	
	

}
