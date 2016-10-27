package generic1;

import java.util.ArrayList;
import java.util.List;

public class PrintListMain {

	public static void printList(List<? extends Number> list) {
		for (Object elem: list)
		System.out.println(elem + " ");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(5);
		ls.add(8);
		ls.add(2);
		PrintListMain.printList(ls);
				
		List<Double> ls1=new ArrayList<Double>();
		ls1.add(5.5);
		ls1.add(8.8);
		ls1.add(2.2);
		PrintListMain.printList(ls1);
	}

}
