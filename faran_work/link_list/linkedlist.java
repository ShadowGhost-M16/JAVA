package faran_work.link_list;
public class linkedlist {

	private Node head;

	// {
	public void insert(int data) {
		//create a new Node and store a data.
		Node node = new Node();
		node.data = data;
		node.nextNode = null;

		//check the head is null or not.
		//if head is null, assign the Node and exit.
		if (this.head == null) {
			head = node;
			return;
		}

		//assign a head into the temp Node and loop it until find the null reference.
		Node tempNode = this.head;
		while (tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}

		//assign new node.
		tempNode.nextNode = node;
	}
	// }

	public void insertNth(int data, int position) {
		//create new node.
		Node node = new Node();
		node.data = data;
		node.nextNode = null;


		if (this.head == null) {
			//if head is null and position is zero then exit.
			if (position != 0) {
				return;
			} else { //node set to the head.
				this.head = node;
			}
		}

		if (head != null && position == 0) {
			node.nextNode = this.head;
			this.head = node;
			return;
		}

		Node current = this.head;
		Node previous = null;

		int i = 0;

		while (i < position) {
			previous = current;
			current = current.nextNode;

			if (current == null) {
				break;
			}

			i++;
		}

		node.nextNode = current;
		previous.nextNode = node;
	}

	// {
	public void print() {
		if (this.head == null) {
			return;
		}
		//print all nodes
		Node tempNode = this.head;
		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.nextNode;
		}
		System.out.println("NULL");




	}
	public  void deleteNode(int position)
	{
		Node node = new Node();

		if (head == null)
			return;


		Node temp = head;


		if (position == 0) {
			head = temp.nextNode;
			return;
		}


		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.nextNode;


		if (temp == null || temp.nextNode == null)

			return;

		Node next = temp.nextNode.nextNode;

		temp.nextNode = next;

	
	}
	public int delete_delta ()
	{
		Node max = head;
		int pos = 0;
		Node current = head.nextNode;
		
		while (current != null)
		{
			if (current.data > max.data)
			{
				max = current;
				
			}
			pos++;
			current = current.nextNode;
			
		}
		
		return pos;
		
	}
	public void sorted_insert ( int data)
	{
		Node node = new Node();
		node.data = data;
		node.nextNode = null;
		if (node.data < head.data)
		{
			node.nextNode = head;
			head = node;

		}
		Node temp =  head;
		while (temp.nextNode.data < node.data)
		{
			temp = temp.nextNode;
		}
		node.nextNode = temp.nextNode;
		temp.nextNode = node;
	}
	public void sorted_Linked ()
	{
		int temp;
		Node current = head;
		Node index = null;
		while (current != null)
		{
			index = current.nextNode;
			while (index != null)
			{
				if(current.data > index.data)
				{
					temp = current.data;
					current.data = index.data;
					index.data = temp;
				} 
				index = index.nextNode;
			}
			current = current.nextNode;
		}

		}
		public void sorted_Linked1 ()
		{
			int temp;
			Node current = head;
			Node index = null;
			while (current != null)
			{
				index = current.nextNode;
				while (index != null)
				{
					if(current.data > index.data)
					{
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					} 
					index = index.nextNode;
				}
				current = current.nextNode;

			}

		}
		public void dop ()
		{
			Node f = head;
			

			while (f != null && f.nextNode != null)
			{
				
				if (f.data == f.nextNode.data)
				{
					f.nextNode = f.nextNode.nextNode;
				}
				else{
					f = f.nextNode;
				}
			}
		
		

	}
		public void  reverselist (){

			
			Node previous1 = null;
			Node next = null;

			while (head != null)
			{
				next = head.nextNode;
				head.nextNode = previous1;
				previous1 = head;
				head = next;
			}
				
			





		}

	public static void main(String[] args) {
		linkedlist ls = new linkedlist();
		linkedlist ls2 =  new linkedlist();
		
		ls.insert(13);
		ls.insert(2222);
		ls.insert(30);
		ls.insert(277456467);
		ls.insert(500);
		ls.sorted_Linked();
		/*
		ls.print();
		ls.deleteNode(ls.delete_delta());
		*/
		ls.print();
		ls2.insert(1);
		ls2.insert(1);
		ls2.insert(2);
		ls2.print();
		ls2.dop();
		ls2.print();
		ls2.reverselist();
		ls2.print();
		
	}
}

