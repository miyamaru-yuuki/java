
public class Shouhin {
	private int sid;
	private String sname;
	private int tanka;

	void show(){
	      System.out.println(sname);
	}

	int getSid() {
		return sid;
	}

	String getSname() {
		return sname;
	}

	int getTanka() {
		return tanka;
	}
	void setSid(int n) {
		sid = n;
	}
	void setSname(String n) {
		sname = n;
	}
	void setTanka(int n) {
		tanka = n;
	}
}
