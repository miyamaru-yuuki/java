
public class Sankaku implements Shape{

	private int teihen;
	private int takasa;

	public Sankaku(int teihen,int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}

	public int getMenseki() {
		return teihen * takasa / 2;
	}

	public String toString() {
		return "底辺:" + teihen + "高さ:" + takasa;
	}
}
