
public class StrSample {

	public static void main(String[] args) {
		String str = "パイナップル,100";
		int snameindex = str.indexOf(",");
		System.out.println(str.substring(0,snameindex) );
	}
}
