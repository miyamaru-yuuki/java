
public class Sankaku extends Shape{

	private int teihen;
	private int takasa;

	public Sankaku(int teihen,int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}

	public int getMenseki() {
		return teihen * takasa / 2;
	}
}
