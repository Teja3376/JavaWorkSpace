package task2.collection.me;

import java.io.Serializable;

public class Student implements Serializable {
	private int  sno;
	private String sname;
	private long snumber;
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getSnumber() {
		return snumber;
	}
	public void setSnumber(long sage) {
		this.snumber = sage;
	}
}
