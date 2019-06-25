
public class Shouhin {
	private int sid;
	private String sname;
	private int tanka;

	Shouhin(int c1,String c2,int c3){
	    sid = c1;
	    sname = c2;
	    tanka = c3;
	}

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
