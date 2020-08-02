
public class Shouhin {
	private int sid;
	private String sname;
	private int tanka;

//	public Shouhin() {
//		System.out.println("Shouhin()");
//	}

	public Shouhin(int sid, String sname, int tanka) {
		System.out.println("Shouhin(int sid, String sname, int tanka)");
		this.sid = sid;
		this.sname = sname;
		this.tanka = tanka;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getTanka() {
		return tanka;
	}

	public void setTanka(int tanka) {
		this.tanka = tanka;
	}

	void show(){
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(tanka);
	}
}
