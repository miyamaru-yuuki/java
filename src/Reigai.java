import java.io.FileWriter;
import java.io.IOException;

public class Reigai {
	public static void main(String[] args) throws IOException{
//		func();
//		func2();
		func3(151);
	}

	public static void func() {
		while(true){
			try {
				String num = new java.util.Scanner(System.in).nextLine();
				double ans = 10 / Integer.parseInt(num);
				System.out.println(ans);
				break;
			}catch(ArithmeticException e) {
				System.out.println("０で除算しました");
				System.out.println(e.getMessage());
			}catch(Exception e){
				System.out.println("数値を入力してください");
				System.out.println(e.getMessage());
			}
		}
	}

	public static void func2() throws IOException {
		FileWriter fw = new FileWriter("test.txt");
		fw.write("abc");
		fw.close();
	}

	public static void func3(int num) {
		if(num < 0 || num >= 150) {
			throw new IllegalArgumentException("正しい年齢を入力してください");
		}
		System.out.println("あなたの年齢は" +num+ "歳です");
	}
}
