class Student
{
protected int sno,m1,m2,tot;
protected double avg;
	public void reada()
	{
	sno=151;
	m1=40;
	m2=42;
	}	
}
class Marks extends Student
{
	public void readb()
	{
	tot=m1+m2;
	}
	public void findAvg()
	 {	
	 avg =tot/2.0;
	  }
	public void print()
		{
		readb();
		findAvg();
		System.out.println(sno+"  "+tot+"  "+avg);
		}
}
class Inher1
{
public static void main (String Args[])
	{
	Marks s = new Marks();
	s.reada();
	s.readb();
	s.print();
	}
}
