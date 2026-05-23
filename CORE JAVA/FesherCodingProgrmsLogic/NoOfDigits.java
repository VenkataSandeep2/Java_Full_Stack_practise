import java.util.*;
class NoOfDigits
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();
      int count = 0;

      while(num != 0)
        {
          num = num/10;
          count++;
        }
      System.out.println("Number of Digits are :->  "+count);
    }
  }

/*
OUTPUT

Enter a number
32152
Number of Digits are :->  5

=== Code Execution Successful ===

Enter a number
859354125
Number of Digits are :->  9

=== Code Execution Successful ===

Enter a number
00213
Number of Digits are :->  3

=== Code Execution Successful ===

*/


// IF THE ENTER THE TEXT
// Enter a number
// nm
// ERROR!
// Exception in thread "main" java.util.InputMismatchException
// 	at java.base/java.util.Scanner.throwFor(Scanner.java:947)
// 	at java.base/java.util.Scanner.next(Scanner.java:1602)
// 	at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
// 	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
// 	at NoOfDigits.main(Main.java:8)

// === Code Exited With Errors ===
