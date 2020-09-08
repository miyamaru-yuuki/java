import java.util.ArrayList;

public class Keisho {
	public static void main(String[] args) {
		Member m1 = new Member("田中",30);
		Member m2 = new Member("山本",29);
		Stuff s1 = new Stuff("山田",40,"会長");
		Stuff s2 = new Stuff("佐藤",35,"副会長");

		ArrayList<Member> list = new ArrayList<Member>();
		list.add(m1);
		list.add(m2);
		list.add(s1);
		list.add(s2);

		for(Member m : list){
			System.out.println(m.getName());
		}
	}
}