
public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	public void naku() {
		System.out.println(super.getName() + "がワンと鳴いた");
	}

}
