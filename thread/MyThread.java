class MyThread implements Runnable
{
	public void run()
	{
		for (int i=1;i<=10 ;i++ )
		 {
		 	System.out.println("the value of i is this :"+i);
			try
			{
				Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}

		}
	}
	public static void main(String[] args)
	 {
	 	AnotherThread st=new AnotherThread();

		MyThread t=new MyThread();

		Thread Thread= new Thread(t);
		Thread.start();
		st.start();


	}
}