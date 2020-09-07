import java.util.ArrayList;
public class Member {

	private String name;
	private int age;
	private ArrayList<Member> list;

	public Member(String name,int age) {
		this.name = name;
		this.age = age;
		this.list = new ArrayList<Member>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void add(Member m) {
		this.list.add(m);
	}

	void show(){
		for(Member m : list){
			System.out.println(this.getPosition());
		}
	}

//	void show(){
//		System.out.println(this.name+" "+this.age+ "歳");
//	}
}
