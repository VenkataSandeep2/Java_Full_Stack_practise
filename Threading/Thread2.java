package com.multi_Threading;

class myclass extends Thread
{
	public void run()
	{
	for(int i = 1; i<= 5; i++)
	{
		System.out.println("child threaddd " +i);
	}
	}	
}
class Thread2
{
	public static void main(String args[])
	{
		myclass m = new myclass();
		m.start();
		
		Thread t = Thread.currentThread();
		t.setName("Main Thread");
		for(int i = 1; i<=5; i++)
		{
			System.out.println(i);
		}
	
	}
}


// 		OUTPUT
// 			1
// 2
// 3
// 4
// 5
// child thread 1
// child thread 2
// child thread 3
// child thread 4
// child thread 5

