
class Cat extends Animal{
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	void naku() {
		System.out.println(this.name + "がニャーと鳴いた");
	}

}
