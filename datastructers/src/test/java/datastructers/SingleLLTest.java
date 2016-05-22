package datastructers;

import com.subbu.lists.SingleLL;

public class SingleLLTest {
	
	public static void main(String[] args) {
		
		SingleLL ll= new SingleLL();
		for (int i = 0; i < 10; i++)
		{
			ll.add(i);
			
		}
		ll.remove();
		ll.remove();
		System.out.println(ll.toString());
		System.out.println("size of the list "+ ll.size);
	}
	
	

}
