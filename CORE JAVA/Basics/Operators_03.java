class Operators_03
  {
    public static void main(String args[])
    {
      int a = 22;
      int b = 5;
      System.out.println("Arithmetic Operator");
      System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(a/b);
      System.out.println(a % b);      
      System.out.println();
        
      System.out.println("assignment Operator");
      System.out.println(a += b);
      System.out.println(a -= b);
      System.out.println(a *= b);
      System.out.println(a /= b);
      System.out.println(a %= b);  
      System.out.println();
        
      System.out.println(" Relational Operator");
      System.out.println(a == b);
      System.out.println(a != b);
      System.out.println(a < b);
      System.out.println(a > b);
      System.out.println(a <= b);
      System.out.println(a >= b);

      System.out.println();
      System.out.println("Logical Operator");
      System.out.println(( a > b) && ( b < 10));
      System.out.println(( a > b) || (b < 10));

      System.out.println("Increment operator");
      System.out.println(a++);
      System.out.println(b++);
      System.out.println(a--);
      System.out.println(--b);
      

       System.out.println(" Ternary Operator ");
        int min = (a < b) ? a : b;
        System.out.println("Minimum is: " + min);
      
    }
  }
