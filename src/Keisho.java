import java.util.ArrayList;

public class Keisho {
	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("田中",30));
		list.add(new Member("山本",29));
		list.add(new Stuff("山田",40,"会長"));
		list.add(new Stuff("佐藤",35,"副会長"));

		for(Member m : list){
			m.show();
		}

	}
}