import java.io.FileWriter;

public class Reigai {
	public static void main(String[] args) {
//		try {
			func();
//		}catch(ArithmeticException e){
//		    // エラー処理（エラーメッセージ名を出すなど）
//			System.out.println("０で除算しました");
//		}catch(NumberFormatException e){
//			System.out.println("数値を入力してください");
//		}
			FileWriter fw = new FileWriter("test.txt");
			fw.write("abc");
			fw.close();
	}
	public static void func() {
		// 通常処理
		String num = new java.util.Scanner(System.in).nextLine();
		int ans = 10 / Integer.parseInt(num);
	}
}
