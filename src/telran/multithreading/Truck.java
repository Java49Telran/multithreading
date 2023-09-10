package telran.multithreading;

public class Truck extends Thread {
	
	private int load;
	private static long elevator1;
	public static long getElevator1() {
		return elevator1;
	}
	public static long getElevator2() {
		return elevator2;
	}
	private static long elevator2;
	private int nLoads;
	public Truck(int load, int nLoads) {
		this.load = load;
		this.nLoads = nLoads;
	}
	@Override
	public void run() {
		for (int i = 0; i < nLoads; i++) {
			loadElevator1();
			loadElevator2();
		}
	}
	private void loadElevator2() {
		elevator2 += load;
		
	}
	private void loadElevator1() {
		elevator1 += load;
		
	}
}
