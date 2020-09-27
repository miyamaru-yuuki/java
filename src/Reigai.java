public class Reigai {
	public static void main(String[] args) {
		try{
		    // 通常処理
			int num = 10 / 0 ;
		}catch(ArithmeticException e){
		    // エラー処理（エラーメッセージ名を出すなど）
			System.out.println("０で除算しました");
		}
	}
}
