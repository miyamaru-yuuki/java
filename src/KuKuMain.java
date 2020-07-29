import java.util.ArrayList;
public class KuKuMain {
	public static void main(String[] args) {
		int correctCount = 0;
		KuKuMondai mArray[];
		mArray = new KuKuMondai[5];
		ArrayList<KuKuMondai> list = new ArrayList<KuKuMondai>();
		for(KuKuMondai m : mArray){
			m = new KuKuMondai();
			m.show();
			String kotaestr = new java.util.Scanner(System.in).nextLine();
			int kotae = Integer.parseInt(kotaestr);
			if(m.check(kotae)) {
				System.out.println("正解！");
				correctCount = correctCount + 1;
			}else {
				System.out.println("不正解。正解は" + m.getKotae());
			}
		}
		System.out.println("正解数:" +correctCount);
	}
}
