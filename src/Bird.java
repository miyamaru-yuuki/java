
public class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	public void naku() {
		System.out.println(super.getName() + "がチュンと鳴いた");
	}
}
