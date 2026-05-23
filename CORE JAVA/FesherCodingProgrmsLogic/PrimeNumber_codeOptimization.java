import java.util.Scanner; 
class PrimeNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number :- ");
      int num = sc.nextInt();
      PrimeNumber pm = new PrimeNumber();
      pm.checkisPrime(num);
    }

    void checkisPrime(int num)
    {
      int count =0;
      
      for(int i = 1;i <=num; i++)
        {
          if(num % i == 0)
          {
            count++;
          }
        }
        if (count == 1) 
        {
            System.out.println(num + " neither Prime Number and composite number");

          
        } else if(count == 2)
            {
                System.out.println(num + " is a Prime Number");
            }
            else
                {
                System.out.println(num + " is not a Prime Number");
                }
        }
  
}

/*

OUTPUT

Enter a number :- 
98
98 is not a Prime Number

=== Code Execution Successful ===

Enter a number :- 
17
17 is a Prime Number

=== Code Execution Successful ===

Enter a number :- 
556
556 is not a Prime Number

=== Code Execution Successful ===

*/

import java.util.Scanner; 
class PrimeNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number :- ");
      int num = sc.nextInt();
      PrimeNumber pm = new PrimeNumber();
    //  pm.checkisPrime(num);
      pm.checkisPrime2(num);
    }
void checkisPrime2(int num)
    {
        int count = 0;
        
        for(int i = 2;i<= num;i++)
        {
            if(num %i  ==0)
            {
                count++;
            }
        }
        if(count == 1)
        {
            System.out.println(num +" is prime num");
            
        }else
            {
                System.out.println(num +" Not a prime num");
            }
            
    }
  
}

/*
    OUTPUT

Enter a number :- 
854
854 Not a prime num

=== Code Execution Successful ===

Enter a number :- 
83
83 is prime num

=== Code Execution Successful ===

*/

