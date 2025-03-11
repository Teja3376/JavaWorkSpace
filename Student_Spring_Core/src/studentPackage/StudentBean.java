package studentPackage;

public class StudentBean implements StudentInterface {
	private int sno;
	private String sname;
	private int sage;
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	StudentBean(){
		
	}
@Override
public void data() {
	// TODO Auto-generated method stub
	System.out.println(sno);
	System.out.println(sname);
	System.out.println(sage);
}
	
}
