public class KuKuMondai {
	private int num1;
	private int num2;

	public KuKuMondai() {
		super();
		this.num1 = new java.util.Random().nextInt(9) + 1;
		this.num2 = new java.util.Random().nextInt(9) + 1;
	}

	void show(){
		System.out.println(num1 +"+️"+ num2);
	}

	int getKotae() {
		return num1+num2;
	}

	boolean check(int kotae) {
		if(kotae == this.getKotae()) {
			return true;
		}else {
			return false;
		}
	}
}
