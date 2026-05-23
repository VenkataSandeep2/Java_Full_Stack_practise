import java.util.*;
class CountOfEven
  {
    public static void main(String args[])
    {
      int count = 0;
      System.out.println("Enter a number: -> ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      for(int i = 1 ;i<= num ; i++)
        {
          if(i % 2 == 0)
          
          count++;
        }
      System.out.println("No of Even Numbers :- " +count);
    }
  }

/*     
OUTPUT

Enter a number: -> 
5
No of Even Numbers :- 2

=== Code Execution Successful ===

Enter a number: -> 
125
No of Even Numbers :- 62

=== Code Execution Successful ===


*/
