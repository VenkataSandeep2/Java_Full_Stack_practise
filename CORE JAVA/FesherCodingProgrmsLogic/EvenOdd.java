import java.util.*;
class EvenOdd
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number");
      int num = sc.nextInt();

      if(num%2 == 0)
        {
        System.out.println(num + " is Even");
        } else
      {
        System.out.println(num+ "is Odd");
      }
     }
  }

/*

  OUTPUT
  Enter a number
5512
5512 is Even

=== Code Execution Successful ===

  Enter a number
985655447
985655447is Odd

=== Code Execution Successful ===

  */
