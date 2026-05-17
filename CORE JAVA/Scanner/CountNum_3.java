import java.util.*;
class CountNum_3
  {
    public static void main(String args[])
    {
      int count = 0 ;
      Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
      int range = sc.nextInt();
      System.out.println();

      for(int i = 0;i<= range ;i++)
        {
          if(i % 2 ==0)
            {
            count++;
            }
          }
    System.out.println(count);
    }
  }



// OUTPUT

  
