
public class En extends Shape{

	private int hankei;

	public En(int hankei) {
		this.hankei = hankei;
	}

	public double getMenseki() {
		return hankei * hankei * 3.14;
	}

}
