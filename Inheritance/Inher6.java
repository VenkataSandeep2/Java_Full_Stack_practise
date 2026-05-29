class GrandParent
{
 protected int gp;	//grandparent
	public void reada()
	{
	gp = 75;
	}

}
class Parent extends GrandParent
{
protected int p;
	public void readb()
	{
	p = 45;
	}

}


class Son extends Parent
{
protected int s;
	public void readc() 
	{
	s =21;
	}
}
class Grandson extends Son
{
private int gs;
	public void readd()
	{
	gs = 21;  
	}
	public void print()
	{
	System.out.println("Grandparent age :"+gp);
	System.out.println("Parent age :"+p);
	System.out.println("Son age :"+s);
	System.out.println("Grandson age :"+gs);
	}
}

class Inher6
{
public static void main(String args[])
	{
	Grandson g=new Grandson();
	g.reada();
	g.readb();
	g.readc();
	g.readd();
	g.print();
	}
}