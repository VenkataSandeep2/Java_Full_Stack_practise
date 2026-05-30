class ExplicitTypeCasting
{
    public static void main(String[] args)
    {
        System.out.println("What is Explicit Type Casting ?");
        System.out.println("---> Forcefully to convert the data type");
        System.out.println("Explicit Type Casting is the manual conversion of a larger data type into a smaller data type using the cast operator (datatype). It may cause data loss or overflow.");
        double num1 = 100000.890;
        float num2 = (float) num1;
        float num3 = 1000.25f;
        long num4 = (long) num3;
        long num5 = 50000;
        int num6 = (int) num5;
        int num7 = 126;
        short num8 = (short) num7;
        short num9 = 100;
        byte num10 = (byte) num9;
        short num11 = 128;
        byte num12 = (byte) num11;
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);
        System.out.println(num11);
        System.out.println(num12);
    }
}

/* 
OUTPUT
---> Forcefully to convert the data type
  What is Explicit Type Casting ?
Explicit Type Casting is the manual conversion of a larger data type into a smaller data type using the cast operator (datatype). It may cause data loss or overflow.
100000.89
100000.89
1000.25
1000
50000
50000
126
126
100
100
128
-128

=== Code Execution Successful ===

  */
