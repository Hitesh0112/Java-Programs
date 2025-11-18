import java.util.*;
public class FizzBuzz{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        if(num1<=0)
        {
            System.out.println("Invalid Input Try once more");
            return;
        }
        else
        {
            if(num1%3==0&&num1%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(num1%5==0)
            {
                System.out.println("Fizz");
            }
            else if(num1%3==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(num1);
            }
        }
    }
}
