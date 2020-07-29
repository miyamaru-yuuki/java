import java.util.ArrayList;

public class KuKuMain {
	public static void main(String[] args) {
		int correctCount = 0;
		KuKuMondai m1 = new KuKuMondai();
		KuKuMondai m2 = new KuKuMondai();
		KuKuMondai m3 = new KuKuMondai();
		KuKuMondai m4 = new KuKuMondai();
		KuKuMondai m5 = new KuKuMondai();
		ArrayList<KuKuMondai> list = new ArrayList<KuKuMondai>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		for(KuKuMondai m : list){
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
