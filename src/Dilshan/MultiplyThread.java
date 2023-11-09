package Dilshan;

public class MultiplyThread extends Thread {
	
     private Object lock;
     private int start;
     private int range;
     
    

	public MultiplyThread(Object lock, int start, int range) {
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	public void run()
	{
		synchronized (lock) {
			for(int i=2; i<=10; i++)
			{
				int tot = i * i;
				System.out.print("Thread-0 = " );
				System.out.print(+i+ "*" +i+ "=" +tot);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				lock.notify();  //one by one option
				
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println();
			}
			
		}
		
	}
     
     
}
