
public class Dog extends Animal{
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	void naku() {
		System.out.println(this.name + "がワンと鳴いた");
	}

}
