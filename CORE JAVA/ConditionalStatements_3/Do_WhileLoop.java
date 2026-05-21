 import java.util.Scanner;

class Do_WhileLoop
  {
    public static void main(String args[])
    {
      int num = 10;
      do 
      {
        System.out.println("Line number " + num);
        num++;
      }
        while (num <= 3);
        
        System.out.println("After excution Line number is " + num);
        System.out.println();
      
    Scanner sc = new Scanner(System.in);
        int pin;

        do {
            System.out.print("Enter your 4-digit secret PIN: ");
            pin = sc.nextInt();
            
            if(pin != 5566) {
                System.out.println("Incorrect PIN. Try again.");
            }
        } while (pin != 5566);

        System.out.println("Access Granted. Welcome back!");
          
        
     }
  }

/*
OUTPUT
Line number 10
After excution Line number is 11

Enter your 4-digit secret PIN: 8899
Incorrect PIN. Try again.
Enter your 4-digit secret PIN: 5566
Access Granted. Welcome back!

=== Code Execution Successful ===


*/



