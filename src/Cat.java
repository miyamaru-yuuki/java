
public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	public void naku() {
		System.out.println(super.getName() + "がニャーと鳴いた");
	}

}
