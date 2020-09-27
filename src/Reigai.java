public class Reigai {
	public static void main(String[] args) {
		func();
	}

	public static void func() {
		try{
		    // 通常処理
			String num = new java.util.Scanner(System.in).nextLine();
			int ans = 10 / Integer.parseInt(num);
		}catch(ArithmeticException e){
		    // エラー処理（エラーメッセージ名を出すなど）
			System.out.println("０で除算しました");
		}
		}
}
