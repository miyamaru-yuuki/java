import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Reigai {
	public static void main(String[] args) throws IOException{
		ShouhinFile sf = new ShouhinFile("test.txt");
		Shouhin s = new Shouhin("テスト",10000);
		sf.load();
		sf.add(s);
		sf.save();
		int size = sf.size();
		for (int count = 0; count < size; count++){
			Shouhin shouhin = sf.get(count);
			System.out.println(shouhin.getSname());
			System.out.println(shouhin.getTanka());
		}
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

	public static void func2(){
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
			pw.println("abc");
			pw.println("def");
			pw.println("ghi");
			pw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void func3(int num){
		if(num < 0 || num >= 150) {
			throw new IllegalArgumentException("正しい年齢を入力してください");
		}
		System.out.println("あなたの年齢は" +num+ "歳です");
	}

	public static ArrayList<Shouhin> func4(){
		ArrayList<Shouhin> list = new ArrayList<Shouhin>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			String line;
			while((line = br.readLine()) != null){
				String[] shouhins = line.split(",");
				list.add(new Shouhin(shouhins[0],Integer.parseInt(shouhins[1])));
			}
			br.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
