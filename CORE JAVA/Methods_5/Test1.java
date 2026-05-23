class Test1
  {
static void add(int a , int b)
    {
      System.out.println(" a + b :-" + (a+b));
    }
    
    
    public static void main(String args[])
    {      
      add(50,50);
    }
  }

/*
OUTPUT

 a + b :-100

=== Code Execution Successful ===

*/


// USING OBJECT

class Test1
  {
void add(int a , int b)
    {
      System.out.println(" a + b :-" + (a+b));
    }
    
    
    public static void main(String args[])
    {      
        Test1 t =new Test1();
        t.add(50,50);
    }
  }

/*

OUTPUT

 a + b :-100

=== Code Execution Successful ===

*/
