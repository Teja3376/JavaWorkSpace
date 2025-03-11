package task4.collection.me;

public class Books {
	private int bno;
	private String bname;
	private double bprice;
	
	public Books (int bno, String bname, double bprice) {
		this.bno = bno;
		this.bname = bname;
		this.bprice = bprice;
	
	}
	// OverRide
	public String toString() {
		return bno + bname + bprice ;
	}
	
}
