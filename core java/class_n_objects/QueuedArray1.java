public class QueuedArray1 
{
	 private int capacity = 5;
	 private int arr[] = new int[capacity];
	 private int front=-1,rear=0;

 public void push(int pushed)
 {
	  if (front< capacity - 1)
		 {
		   front++;
		   arr[front] = pushed;
		   System.out.println("Element " + pushed+ " is pushed to queue !");
		
		} 
		else 
		{
			System.out.println("queue Overflow !");
		}
 }

 public void pop() {
		if (front >= rear) 
		{
		rear++;
		System.out.println("Pop operation done !");
		} 
		else
		{
		System.out.println("queue Underflow !");
		}
	 }

 public void printElements()
 {
	  if (front >= rear)
		{
			System.out.println("Elements in queue :");
			for (int i = rear; i <= front; i++)
				{
				System.out.println(arr[i]);
				}
		}
 }

 public static void main(String[] args) {
  QueuedArray1 queue = new QueuedArray1();

  queue.pop();
  queue.push(23);
  queue.push(2);
  queue.push(73);
  queue.push(21);
  queue.pop();
  queue.pop();
  queue.printElements();
 }

}