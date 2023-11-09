package Dilshan;


public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object lock = new Object();
		
		
		
		plusThread thread1 = new plusThread(lock,2,10);
		MultiplyThread thread2 = new MultiplyThread(lock,2,10);
		
		thread1.start();
		thread2.start();
		
		
	}
}