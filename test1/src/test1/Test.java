package test1;
import java.util.*;

public class Test {

	public static void main(String[] args) 
	{
		Deque<String> d = new ArrayDeque<String>();  
		
	d.add("hi");
	d.add("bye");
	d.add("night4");
	d.addFirst("bye");
	d.removeFirst();
	Iterator<String> I= d.iterator();
	while(I.hasNext())
	{
		System.out.println(I.next());
		System.out.println(I.next());
	}

	
	}

}
