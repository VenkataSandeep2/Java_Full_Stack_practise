
class Pattern3
{
    public static void main(String args[])
    {
        for(int i = 1; i<= 5 ;i++)
        {
            for(int j = 5; j>= i;j--)
            {
                System.out.print("+ ");
            }
        
            System.out.println();
        }
        //System.out.println();
        
    }
}

/* 

OUTPUT

+ + + + + 
+ + + + 
+ + + 
+ + 
+ 

=== Code Execution Successful ===
  */


class Pattern3
{
    public static void main(String args[])
    {
        for(int i = 1; i<= 5 ;i++)
        {
            System.out.println("Row"+i);
            
            for(int j = 5; j>= i;j--)
            {
                System.out.print("i"+i+"     " +"j"+j);
            }
        
            System.out.println();
        }
        //System.out.println();
        
    }
}


/*
OUTPUT

Row1
i1     j5i1     j4i1     j3i1     j2i1     j1
Row2
i2     j5i2     j4i2     j3i2     j2
Row3
i3     j5i3     j4i3     j3
Row4
i4     j5i4     j4
Row5
i5     j5

=== Code Execution Successful ===

    */
