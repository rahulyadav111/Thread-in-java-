class Consumer extends Thread
{
	Company c; 
	Consumer(Company c)
	{
		this.c=c; 

	}
	public void run()
	{
		int i=1;
		while(true)
		{
			try{
				this.c.produce_item(i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{

			}
				i++;
			
		}
	}
}