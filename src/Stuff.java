
class Stuff extends Member{

	private String position;

	public Stuff(String name,int age,String position) {
		super(name,age);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	void show(){
		super.show();
		System.out.println(this.position);
	}
}
