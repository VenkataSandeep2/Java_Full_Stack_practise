//by using Char = s.toCharArray

class String4
{
public static void main (String[] args)
	{
	char x[] = {'s','a','n','d'};
	String s= new String(x);
	System.out.println("The Object is : "+s);
	System.out.println("The Length of the String is : "+s.length());
	
	char y[] = s.toCharArray();					//conver the string object
	System.out.println("The char array: "+s);
	for (int i = 0; i < y.length; i++) {
	System.out.println(y[i]);
	}

	byte b[] = {65,66,67,68,69,70};
	String s1 = new String(b);
	System.out.println("The object is : "+s1);
	System.out.println("The array length  : " +s1.length());
	byte bb[] =s1.getBytes();
	       for(int i =0;i< bb.length ;i++)
			{
			System.out.println(bb[i]);
			}
	}

}
