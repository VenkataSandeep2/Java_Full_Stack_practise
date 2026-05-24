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
  //    pm.checkisPrime2(num);
      pm.checkisPrime3(num);
    }
   void checkisPrime3(int num)
    {
       int count = 0;
        for(int i = 2 ;i<num;i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count == 0 && num>1)
        {
            System.out.println(num +" is prime number");
        }
        else
            {
                System.out.println(num +" Not a prime number");
            }          
    }
 }

/*

    OUTPUT
Enter a number :- 
71
71 Not a prime number

=== Code Execution Successful ===

Enter a number :- 
97
97 Not a prime number

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
  //    pm.checkisPrime2(num);
//      pm.checkisPrime3(num);
      pm.checkisPrime4(num);
    }
 void checkisPrime4(int num)
    {
       int count = 0;
        for(int i = 2 ; i <= num/2 ;i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println(num +" is prime number");
            
        }else
            {
                System.out.println(num +" Not a prime number");
            }       
    }
}

/*
    OUTPUT
Enter a number :- 
10009
10009 is prime number

=== Code Execution Successful ===

Enter a number :- 
856
856 Not a prime number

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
  //    pm.checkisPrime2(num);
// //      pm.checkisPrime3(num);
//       pm.checkisPrime4(num);
      pm.checkisPrime5(num);
    }
 void checkisPrime4(int num)
    {
       int count = 0;
        for(int i = 2 ; i <= Math.sqrt(num) ;i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println(num +" is prime number");
            
        }else
            {
                System.out.println(num +" Not a prime number");
            }       
    }
}

/*

Enter a number :- 
10009
10009 is prime number

=== Code Execution Successful ===

  Enter a number :- 
9989
9989 Not a prime number

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
  //    pm.checkisPrime2(num);
// //      pm.checkisPrime3(num);
//       pm.checkisPrime4(num);
          pm.checkisPrime5(num);
      pm.checkisPrime6(num);
    }
 void checkisPrime6(int num)
    {
       int count = 0;
        for(int i = 2 ; i <= Math.sqrt(num) ;i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println(num +" is prime number");
            
        }else
            {
                System.out.println(num +" Not a prime number");
            }       
    }
}

/*


Enter a number :- 
10009
10009 is prime number

=== Code Execution Successful ===

  Enter a number :- 
9897
9897 Not a prime number

=== Code Execution Successful ===

  Enter a number :- 
88773
88773 Not a prime number

=== Code Execution Successful ===

*/


