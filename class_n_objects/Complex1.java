class Complex1
{
	private int real,imag;
	public Complex1()
	{}
	public Complex1(int real1,int imag1)
	{
		this.real=real1;
		this.imag=imag1;
	}
	public Complex1 add(Complex1 C1,Complex1 C2)
	{
		Complex1 CSum=new Complex1();
		CSum.real=C1.real+C2.real;
		CSum.imag=C1.imag+C2.imag;
		return CSum;
	}
	public Complex1 sub(Complex1 C1,Complex1 C2)
	{
		Complex1 CSub=new Complex1();
		CSub.real=C1.real-C2.real;
		CSub.imag=C1.imag-C2.imag;
		return CSub;
	}

	public void swap(Complex1 c1,Complex1 c2)
	{
		Complex1 temp=new Complex1();
		temp.real=c1.real;
		temp.imag=c1.imag;
		c1.real=c2.real;
		c1.imag=c2.imag;
		c2.real=temp.real;
		c2.imag=temp.imag;
	}
	public static void main(String[] args)
	{
		Complex1 C1=new Complex1(4,8);
		Complex1 C2=new Complex1(5,7);
		Complex1 C3=new Complex1();
		C3=C3.add(C1,C2);
		System.out.println("SUM:" + C3.real +"+i" + C3.imag);
		C3=C3.sub(C1,C2);
		System.out.println("SUB:" + C3.real +"+i" + C3.imag);
		C3.swap(C1,C2);
		System.out.println("After swap:c1:"+C1.real+"+i" + C1.imag);
		System.out.println("After swap:c2:"+C2.real+"+i" + C2.imag);
	}
}
 
