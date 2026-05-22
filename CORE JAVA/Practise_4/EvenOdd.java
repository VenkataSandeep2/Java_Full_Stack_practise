import java.util.*;
class EvenOdd
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :- >  ");
        int num = sc.nextInt();

        if( num % 2 ==0)
        {
            System.out.println( num +" Even number");
        }
        else
            {
                System.out.println(num +" is Odd Number");
            }
    sc.close();
    }
}

/*

OUTPUT

Enter a number :- >  
1
1 is Odd Number

=== Code Execution Successful ===

Enter a number :- >  
0
0 Even number

=== Code Execution Successful ===



*/



import java.util.*;
class EvenOdd
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :- >  ");
        int num = sc.nextInt();

        if(num == 0)
        {
            System.out.println("Nether even or odd");
        }
        else if( num % 2 ==0)
        {
            System.out.println( num +" Even number");
        }
        else
            {
                System.out.println(num +" is Odd Number");
            }
    sc.close();
    }
}

/*

OUTPUT
Enter a number :- >  
3154876
3154876 Even number

=== Code Execution Successful ===

Enter a number :- >  
0
Nether even or odd

=== Code Execution Successful ===



*/
