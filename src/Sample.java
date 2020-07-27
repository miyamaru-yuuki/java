public class Sample {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shouhin s = new Shouhin(1,"りんご",300);
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getTanka());

		Uriage u = new Uriage(1,5);
		u.show();
	}
}
