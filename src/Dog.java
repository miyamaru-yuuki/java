
public class Dog extends Animal implements Runner{

	public Dog(String name) {
		super(name);
	}

	public void naku() {
		System.out.println(super.getName() + "がワンと鳴いた");
	}

	public void run() {
		System.out.println(super.getName() + "が走った");
	}

	public void walk() {
		System.out.println(super.getName() + "が歩いた");
	}

	public String toString() {
		return super.getName();
	}
}
