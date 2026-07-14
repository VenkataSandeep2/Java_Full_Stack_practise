class Thread_1 extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Child Threaddd: " + i);
        }
    }

    public static void main(String[] args)
    {
        Thread_1 t = new Thread_1();
        t.start();  

        Thread t1 = Thread.currentThread();
        System.out.println("Main Thread: " + t1.getName());

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Main Thread Count: " + i);
        }
    }
}
