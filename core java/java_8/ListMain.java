package conn;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("tom");
		list.add("vishal");
		list.add("jerry");
		
		list.removeIf(s -> s.length() % 2 != 0);
		
		System.out.println(list);
		
	}
}
