public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数を入力してください");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.Scanner sc2 = new java.util.Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc2.nextLine();
		int num = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		int num3 = num + num2;
		System.out.println("数値:" + num3);
	}

}
