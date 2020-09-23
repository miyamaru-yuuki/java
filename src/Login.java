
public class Login {
	public static void main(String[] args) {

		System.out.println("パスワードを入力してください:");
		String pass = new java.util.Scanner(System.in).nextLine();

		if(pass.equals("abc")) {
			System.out.println("ログインしました");
		}else{
			System.out.println("パスワードが違います");
		}

	}

}
