
public class En extends Shape{

	private int hankei;

	public En(int hankei) {
		this.hankei = hankei;
	}

	public int getMenseki() {
		return (int)(hankei * hankei * 3.14);
	}

}
