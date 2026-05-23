import java.util.*;
class PrintOfDigits
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int count = 0;

      while(num != 0)
        {
        int digit= num % 10;
        num = num/ 10;
        System.out.println("Remainings of num are :->  "+num);
        System.out.println("Number of Digits are :->  "+digit);
        //System.out.println("Remainings of num are :->  "+num);
        }
    }
  }

/*
OUTPUT
Enter a number
9595
Current of num are :->  959
Number of Digits are :->  5
Current of num are :->  95
Number of Digits are :->  9
Current of num are :->  9
Number of Digits are :->  5
Current of num are :->  0
Number of Digits are :->  9

=== Code Execution Successful ===

*/




import java.util.*;
class SumOfDigits
    {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int sum = 0;
      int count = 0;

      while(num != 0)
        {
        int digit= num % 10;
        num = num/ 10;
          sum = sum + digit;
          System.out.println("Sum of numbers are :->  "+sum);  
        System.out.println("Remainings of num are :->  "+num);
        System.out.println("Number of Digits are :->  "+digit);
        //System.out.println("Remainings of num are :->  "+num);
        System.out.println();
        }
    }
  }

/*
OUTPUT
Enter a number
12
Sum of numbers are :->  2
Remainings of num are :->  1
Number of Digits are :->  2

Sum of numbers are :->  3
Remainings of num are :->  0
Number of Digits are :->  1


=== Code Execution Successful ===

Enter a number
5255
Sum of numbers are :->  5
Remainings of num are :->  525
Number of Digits are :->  5

Sum of numbers are :->  10
Remainings of num are :->  52
Number of Digits are :->  5

Sum of numbers are :->  12
Remainings of num are :->  5
Number of Digits are :->  2

Sum of numbers are :->  17
Remainings of num are :->  0
Number of Digits are :->  5


=== Code Execution Successful ===


*/
