import java.util.ArrayList;

public class KuKuMain {
	public static void main(String[] args) {
		int correctCount = 0;
		ArrayList<Mondai> list = new ArrayList<Mondai>();
		for (int count = 1; count <= 5; count++){
			list.add(new TasiMondai());
		}
		for(Mondai m : list){
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
