package annotation;

class Parent
{
	@Deprecated
	void info()
	{
		
	}
}

class Study extends Parent
{
	@Override
	public void info()
	{
		System.out.println("Hello");
	}
}
public class StudyMain {
public static void main(String[] args) {
	Study s=new Study();
	s.info();
}
}
