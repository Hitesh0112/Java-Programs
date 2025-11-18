import java.util.*;
public class Main 
{
    public static boolean isPalindrome(int n) 
    {
        int rev=0,temp=n;
        while (temp!=0) 
        {
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        return rev==n;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPalindrome(n)) 
        {
            System.out.println(n+" is a Palindrome number");
        } 
        else 
        {
            System.out.println(n+" is not a Palindrome number");
        }
    }
}
