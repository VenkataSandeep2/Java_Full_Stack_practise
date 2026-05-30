
class ImplicitTypeCasting
{
    public static void main(String[] args) 
  {
      System.out.println("What is ImplicitTypeCasting :");
      System.out.println("Implicit Type Casting is the automatic conversion of a smaller data type into a larger compatible data type by the Java compiler. It is safe because no data is lost during the conversion ");
    byte num1 = 126;
    short num2 = num1;
    int num3 = num2;
    long num4 = num3;
    float num5 = 1000.25f;
    float num6 = num5;
    //int num8 = num5;        //if get the ERROR
    //This is narrowing conversion (float → int), so Java will not do it automatically.
    double num7 = 100000.890;
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(num6);
    System.out.println(num7);
    //System.out.println(num8);    //if get the ERROR
  }
}
/*

OUTPUT
What is ImplicitTypeCasting :
Implicit Type Casting (Widening) is the automatic conversion of a smaller data type into a larger compatible data type by the Java compiler. It is safe because no data is lost during the conversion 
126
126
126
126
1000.25
1000.25
100000.89

=== Code Execution Successful ===



byte  → short
byte  → int
byte  → long
byte  → float
byte  → double

short → int
short → long
short → float
short → double

char  → int
char  → long
char  → float
char  → double

int   → long
int   → float
int   → double

long  → float
long  → double

float → doublear → int
*/


