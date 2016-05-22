package com.subbu.lists;

public class SingleLL {
	
	public Node head;
	public Node tail;
	public int size;
	
	public void add(Object data)
	{
		
		Node n = new Node(data);
		n.next=head;
		head=n;
		if(tail == null)
			tail=n;
		size++;
		 
	}
	
	public void addAtEnd(Object data)
	{
		addAfter(tail,data);
	}
	
	public void addAfter(Node after, Object data)
	{
		Node node = new Node(data);
		if(size==0)
		{
			head=tail=node;
		}else
		{
		     node.next=after.next;	   
		     after.next=node;
		     if(after== tail) tail=node;
		}
		size++;
	}
	
	public Object remove()
	{
		Object data = null;
		if(head == null) return data;
		else
		{
			data= head.data;
			if(head.next== null){
				head=tail= null;
				size--;
				return data;
			}
			head=head.next;
			size --;
			return data;
		}
	}
	
	public String toString()
	
	{
		if(size ==0) return null;
		String string="";
		Node loop=head;
		for(int itr=0;itr<size;itr++){
			string =string + loop.data.toString();
			if(itr<size-1)
				string= string +"-->";
			loop=loop.next;
		}
		return string;
	}

}


