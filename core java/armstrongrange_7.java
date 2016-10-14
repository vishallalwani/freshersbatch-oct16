public class armstrongrange_7
{
    public static void main(String[] args) 
     {
        int num, count = 0, a, b, c, sum = 0;
        System.out.print("armstrong numbers from 100 to 999:");
        for(int i = 100; i <= 999; i++)
        {
            num = i;
            while(num > 0)
            {
                b = num % 10;
                sum = sum + (b * b * b);
                num = num / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}