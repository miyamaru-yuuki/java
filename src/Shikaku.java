
public class Shikaku implements Shape{

	private int tate;
	private int yoko;

	public Shikaku(int tate,int yoko) {
		this.tate = tate;
		this.yoko = yoko;
	}

	public int getMenseki() {
		return tate * yoko;
	}

}
