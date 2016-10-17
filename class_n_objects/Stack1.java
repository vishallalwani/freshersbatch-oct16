public class Stack1 
{
	 private int capacity = 5;
	 private int arr[] = new int[capacity];
	 private int top = -1;

 public void push(int pushed)
 {
	  if (top < capacity - 1)
		 {
		   top++;
		   arr[top] = pushed;
		   System.out.println("Element " + pushed + " is pushed to Stack !");
		
		} 
		else 
		{
			System.out.println("queue Overflow !");
		}
 }

 public void pop() {
		if (top >= 0) 
		{
		top--;
		System.out.println("Pop operation done !");
		} 
		else
		{
		System.out.println("queue Underflow !");
		}
	 }

 public void printElements()
 {
	  if (top >= 0)
		{
			System.out.println("Elements in stack :");
			for (int i = 0; i <= top; i++)
				{
				System.out.println(arr[i]);
				}
		}
 }

 public static void main(String[] args) {
  Stack1 stack = new Stack1();

  stack.pop();
  stack.push(23);
  stack.push(2);
  stack.push(73);
  stack.push(21);
  stack.pop();
  stack.pop();
  stack.printElements();
 }

}