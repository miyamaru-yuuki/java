import java.io.FileWriter;
import java.io.IOException;

public class Reigai {
	public static void main(String[] args) throws IOException{
		func();
		func2();
	}

	public static void func() {
		boolean flg = false;
		do{
			try {
				String num = new java.util.Scanner(System.in).nextLine();
				double ans = 10 / Integer.parseInt(num);
				System.out.println(ans);
				flg = false;
			}catch(ArithmeticException e){
			    // エラー処理（エラーメッセージ名を出すなど）
				System.out.println("０で除算しました");
				flg = true;
			}catch(NumberFormatException e){
				System.out.println("数値を入力してください");
				flg = true;
			}
			}while(flg == true);
	}

	public static void func2() throws IOException {
		FileWriter fw = new FileWriter("test.txt");
		fw.write("abc");
		fw.close();
	}
}
