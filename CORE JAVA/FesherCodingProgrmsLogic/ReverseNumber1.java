
import java.util.*;
class ReverseNumber1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:- ");
      int num =sc.nextInt();
      int rev = 0;
      while(num != 0)
        {
          int digit = num % 10;
          rev = (rev*10) + digit;
          num = num/10;
        System.out.println("The Reverse number is -> "+rev);
            
        }
      //System.out.println("The Reverse number is -> "+rev);
    }
  }

/*

OUTPUT

Enter a number:- 
253
The Reverse number is -> 3
The Reverse number is -> 35
The Reverse number is -> 352

=== Code Execution Successful ===

Enter a number:- 
587965
The Reverse number is -> 5
The Reverse number is -> 56
The Reverse number is -> 569
The Reverse number is -> 5697
The Reverse number is -> 56978
The Reverse number is -> 569785

=== Code Execution Successful ===

*/


import java.util.*;
class ReverseNumber1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:- ");
      int num =sc.nextInt();
      int rev = 0;
      while(num != 0)
        {
          int digit = num % 10;
          rev = (rev*10) + digit;
          num = num/10;
       // System.out.println("The Reverse number is -> "+rev);
            
        }
      System.out.println("The Reverse number is -> "+rev);
    }
  }

/*

OUTPUT

Enter a number:- 
25453
The Reverse number is -> 35452

=== Code Execution Successful ===


Enter a number:- 
05346
The Reverse number is -> 6435

=== Code Execution Successful ===
*/
