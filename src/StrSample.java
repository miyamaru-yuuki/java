
public class StrSample {

	public static void main(String[] args) {
		String str = "1,りんご,100";
		String[] shouhinAry = str.split(",");
		int tankaDouble = Integer.parseInt(shouhinAry[2]) * 2;
		System.out.println(tankaDouble);
	}
}
