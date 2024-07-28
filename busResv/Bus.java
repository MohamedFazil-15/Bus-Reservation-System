package busResv;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;

	Bus(int no, boolean ac, int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	// adding various get() and set() methods to access private variables.
	public int getBusNo() {
		return busNo;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public void setAc(boolean val) {
		ac = val;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity = cap;
	}
	
	public void displayBusInfo(){
		System.out.println("Bus Number : "+ busNo + " AC : "+ ac + " Total Capacity : "+ capacity);
	}
}
