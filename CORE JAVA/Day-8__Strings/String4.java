class String4
{
public static void main(String[] args)
	{
	String s = "Notepad";
	String s1 = "padma";
	boolean res = s.regionMatches(4,s1,0,3);	//(int start1, String s2, int start2, int numChars)
	System.out.println("Both are equal ; " +res);
	System.out.println();
	res = s.regionMatches(false,4,s1,0,3);		//(boolean ignoreCase, int start1, String s2, int start2, int numChars)
	System.out.println("Both are equal ; " +res);	
	} 

}
