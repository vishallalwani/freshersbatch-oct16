package generic1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericHashmap {

	public static void printMapKeyValue(Map<? extends Number,?> hm) {
		for (Object e:hm.entrySet() )
			System.out.println(e + " ");
	}
	
	
	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1, "vishal");
		hm.put(2, "tom");
		GenericHashmap.printMapKeyValue(hm);
	}
}
