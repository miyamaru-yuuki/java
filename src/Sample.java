public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shouhin s = new Shouhin();
		s.setSid(1);
		s.setSname("りんご");
		s.setTanka(200);
		int sid =s.getSid();
		String sname =s.getSname();
		int tanka =s.getTanka();
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(tanka);
	}
}
