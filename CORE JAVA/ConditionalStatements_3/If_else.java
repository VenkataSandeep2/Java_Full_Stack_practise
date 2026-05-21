class If_else
  {
    public static void main(String args[])
    {
      int num1 = 10;
      int num2 = 5;
      if(num1 < num2)
        {
        System.out.println("Num  is big " + num1);
        }
      else{
        System.out.println("Num is big " + num2);
      }
       
       
       if(10 <= 10)
       {
           System.out.println("10 is big");
       }
       else
        {
           System.out.println("10 is big ..");
        }
        
        
        
        int score = 85;

        if (score >= 90) 
        {
            System.out.println("Grade: A");
        }
        else if (score >= 80) 
        {
            System.out.println("Grade: B"); // This will print for a score of 85
            }
        else if (score >= 70) 
        {
            System.out.println("Grade: C");
            } else {
                System.out.println("Grade: F");
                }
    }
    
  }
