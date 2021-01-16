class UserThread extends Thread
{
	public void run()
	{
		System.out.println("this is user defined Thread");
	}
}


	public class ThreadOpration
	{
		public static void main(String[] args) 
		{
			System.out.println("programme is started");
			int x=12+12;
			System.out.println("your ans is this "+x);
			Thread t= Thread.currentThread();
			String tname=t.getName();

			//thread set name we can easily from here 
			t.setName("MyMain");
			System.out.println(t.getName());

		try{
			Thread.sleep(5000);
		}
		catch(Exception e )
		{

		}
		//that is userDefined Thread start 
		UserThread user=new UserThread();
		user.start();
		System.out.println(t.getId());
			System.out.println("the program is ended from here ");

		//System.out.println("current runnig thread is this: "+tname);

	}

}