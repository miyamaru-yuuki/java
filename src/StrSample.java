
public class StrSample {

	public static void main(String[] args) {
		String str = "1,りんご,100";
		String[] tankaindex = str.split(",");
		System.out.println(tankaindex[2]);

//		for(String t  : tankaindex){
//			System.out.println(t);
//		}
	}
}
