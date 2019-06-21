public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字を入力してください");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String str = sc.nextLine();

		if(str.equals("abc")) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}
