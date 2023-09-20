package telran.multithreading;

public class Worker extends Thread {
static final Object mutex1 = new Object();
static final Object mutex2 = new Object();
	public void run() {
		for(int i = 0; i < 10; i++) {
			f1();
			f2();
		}
	}
	private void f2() {
		synchronized(mutex1) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (mutex2) {
				
			}
		}
		
		
	}
	private void f1() {
		synchronized (mutex2) {
			synchronized(mutex1) {
				
			}
		}
		
	}
}
