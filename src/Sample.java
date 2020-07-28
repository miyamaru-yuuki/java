import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		Shouhin s1 = new Shouhin(1,"りんご",300);
		Shouhin s2 = new Shouhin(2,"みかん",200);
		Shouhin s3 = new Shouhin(3,"ぶどう",500);
		Shouhin s4 = new Shouhin(4,"すいか",800);

		ArrayList<Shouhin> list = new ArrayList<Shouhin>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
//		for(Shouhin s : list){
//	        s.show();
//		}
//		Uriage u = new Uriage(1,5,s);
//		u.show();
		Shop sh1 = new Shop();
		sh1.add(s1);
		sh1.add(s2);
		sh1.add(s3);
		sh1.add(s4);
		sh1.show();
		System.out.println(sh1.goukei());
	}
}