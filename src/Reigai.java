import java.io.FileWriter;
import java.io.IOException;

public class Reigai {
	public static void main(String[] args) throws IOException{
		func();
		func2();
	}

	public static void func() {
		int intnum = 0;
		do{
			try {
				String num = new java.util.Scanner(System.in).nextLine();
				intnum = Integer.parseInt(num);
				double ans = 10 / intnum;
				System.out.println(ans);
			}catch(ArithmeticException e){
			    // エラー処理（エラーメッセージ名を出すなど）
				System.out.println("０で除算しました");
			}catch(NumberFormatException e){
				System.out.println("数値を入力してください");
			}
			}while(intnum == 0);
	}

	public static void func2() throws IOException {
		FileWriter fw = new FileWriter("test.txt");
		fw.write("abc");
		fw.close();
	}
}
