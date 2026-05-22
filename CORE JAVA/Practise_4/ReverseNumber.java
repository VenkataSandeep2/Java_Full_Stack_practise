import java.util.*;

class ReverseNumber
  {
     public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int rev = 0 ;

      while(num != 0)
        {
          int digit = num % 10;
          rev = (rev*10) + digit;
          num = num/10;
          
        }
      System.out.println("After reversed Number is :-> "+rev);
  }
  }

/*
OUTPUT
Enter a number
55888
After reversed Number is :-> 88855

=== Code Execution Successful ===

Enter a number
859674
After reversed Number is :-> 476958

=== Code Execution Successful ===

*/
