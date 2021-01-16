class AnotherThread extends Thread
{
	public void run()
	{
		for (int i=10;i>=1 ;i-- )
		 {
		 	System.out.println("the value of another Thread i is this :"+i);

		 	try{
		 		Thread.sleep(2000);
		 	}
		 	catch(Exception e)
		 	{

		 	}

		 }
			
	}
	public static void main(String[] args)
	 {

	 	AnotherThread t=new AnotherThread();
	 	t.start();
		
	}
}
