package generic1;


class Test<T> {
	
	private T t;
	public void set(T t)
	{ 
		this.t = t; 
	}
	public T get() {
		return t; 
	}
}


public class GenericwrapperMain {
public static void main(String[] args) {
	

	Test<String> test = new Test<String>();
	test.set("vishal");
	String str = test.get();
	System.out.println(str);
}
}
