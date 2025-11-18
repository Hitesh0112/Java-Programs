import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, temp = n;
        while (temp != 0) 
        {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if(rev==n)
        {
            System.out.println(n+" is a Palindrome number");
        }
        else
        {
            System.out.println(n+" is not a Palindrome number");
        }
    }
}
