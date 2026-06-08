import java.util.*;
import java.util.concurrent.*;

public class Exp_11 
{

	public static void main(String[] args) 
	{
        BlockingQueue<String> s = new ArrayBlockingQueue<String>(3);

				try {
		s.add("ravi");
		s.add("ramu");
		s.add("rabyyyada");
		s.add("raju");
		
				}
				catch(IllegalStateException ie)
				{
					System.out.println(ie);
				}
				System.out.println("");
		System.out.println("HIIIIIIIIIIII");
	}

}
