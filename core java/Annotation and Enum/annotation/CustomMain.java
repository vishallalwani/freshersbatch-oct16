package annotation;
import java.lang.reflect.Method;

public class CustomMain
{
	private int name = 1;
	private int idd = 2;
	private int salary = 3;
	@Getter(name="abc")
	public int getName() {
		return name;
	}
	@Getter(name="abc")
	public int getId() {
		return idd;
	}

	public int getSal() {
		return salary;
	}
	public static void main(String[] args) 
	{
		Class c = CustomMain.class;
		Method[] m = c.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getAnnotation(Getter.class) != null) {
				String methodName = m[i].getName().toLowerCase();
				String returnValue = methodName.substring(3,
						methodName.length());
				System.out.print(returnValue + " = ");
				try {
					if (c.getDeclaredField(returnValue) != null) {
						System.out.print("found");
						System.out.println();
					}
				} catch (NoSuchFieldException e) {
					System.err.println("Not Found");
				} catch (SecurityException e) {
				}
			}
		}
	}
}