class Company
{
	int n;
	boolean f=false; 
	synchronized public void produce_item(int n) throws Exception 
	{
		if(f)
		{
			wait(); 
		}
		this.n=n;
		System.out.println("produced :"+this.n);

	}
	synchronized public int consume_item() throws Exception  
	{
		if(!f)
		{
			wait();
		}
		System.out.println("consumed :"+this.n);
		f=false;
		notify();
		return this.n;
	}
}