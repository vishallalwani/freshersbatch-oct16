package conn;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
public class BuildinMain {

	
	public static void main(String[] args) {
		
		Random rand = new Random();
		Supplier<Integer> supplier = () -> rand.nextInt(100);
		
		Integer marks = supplier.get();
		if(marks>50)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		
		
		 Consumer<String> c = (x) -> System.out.println(x.toUpperCase());
		    c.accept("vishal");
				
		    
		    System.out.println("FUNCTION----");
		    Function<Integer, String> function = (Integer mark)->mark > 40 ? "PASS" : "FAILED";
		    System.out.println("Result = " + function.apply(45));
		    System.out.println("Result = " + function.apply(23));
		
	}
}
