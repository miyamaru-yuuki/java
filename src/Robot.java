public class Robot implements Runner{

	private String name;

	public Robot(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + "が走った");
	}
}