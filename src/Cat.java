
public class Cat extends Animal implements Runner{

	public Cat(String name) {
		super(name);
	}

	public void naku() {
		System.out.println(super.getName() + "がニャーと鳴いた");
	}

	public void run() {
		System.out.println(super.getName() + "が走った");
	}

	public void walk() {
		System.out.println(super.getName() + "が歩いた");
	}
}
