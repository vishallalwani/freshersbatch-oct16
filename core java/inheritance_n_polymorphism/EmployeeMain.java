 class Employee
{
	private int empid;
	private int salary;
	public Employee(int empid,int salary)
	{
		this.empid=empid;
		this.salary=salary;
	}
	
	public int total_salary()
	{
		return salary;
	}
	
}

class Manager extends Employee
{
	private int incentive;
	public Manager(int empid,int salary,int incentive)
	{
		super(empid,salary);
		this.incentive=incentive;
	}
	public int total_salary()
	{
		return super.total_salary()+this.incentive;
	}
}

class Labour extends Employee
{
	private int overtime;
	public Labour(int empid,int salary,int overtime)
	{
		super(empid,salary);
		this.overtime=overtime;
	}
	public int total_salary()
	{
		return super.total_salary()+this.overtime;
	}
}


public class EmployeeMain
{
	public static void main(String args[])
	{
		Employee e[]=new Employee[3];
		
		e[0]=new Manager(1,6000,1200);
		e[1]=new Labour(1,6000,500);
		for(int i=0;i<e.length;i++)
		{
			System.out.println("The salary for "+e[i].toString()+" is:"+e[i].total_salary());
		}
		
	}
}