abstract class shape
{
	abstract void draw();
}

class line extends shape
{
	public void draw()
	{
		System.out.println("Drawing line");
	}
}

class rectangle extends shape
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}

class cube extends shape
{
	public void draw()
	{
		System.out.println("Drawing cube");
	}
}

public class ShapeMain
{
	public static void main(String[] args)
	{
		shape s[]=new shape[3];
		s[0]=new line();
		s[1]=new rectangle();
		s[2]=new cube();
		for(int i=0;i<s.length;i++)
		{
			s[i].draw();
		}
	}
}