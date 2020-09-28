import java.io.FileWriter;
import java.io.IOException;

public class Reigai {
	public static void main(String[] args) throws IOException{
		try {
			func();
		}catch(ArithmeticException e){
		    // エラー処理（エラーメッセージ名を出すなど）
			System.out.println("０で除算しました");
			main(args);
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください");
			main(args);
		}
		func2();
	}

	public static void func() {
		String num = new java.util.Scanner(System.in).nextLine();
		int ans = 10 / Integer.parseInt(num);
		System.out.println(ans);
	}

	public static void func2() throws IOException {
		FileWriter fw = new FileWriter("test.txt");
		fw.write("abc");
		fw.close();
	}
}
