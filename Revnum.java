import java.util.*;

public class Revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) 
        {
            System.out.println("Reversed Number:"+n);
            return;
        }
        if (n == 0) 
        {
            System.out.println("Reversed Number:0");
            return;
        }
        if (n >= 1 && n <= 9) 
        {
            System.out.println("Reversed Number:"+n);
            return;
        }
        int rev = 0, temp = n;
        while (temp != 0) 
        {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
