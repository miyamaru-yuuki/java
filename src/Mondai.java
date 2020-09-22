
public abstract class Mondai {

	private int num1;
	private int num2;

	public Mondai() {
		this.num1 = new java.util.Random().nextInt(9) + 1;
		this.num2 = new java.util.Random().nextInt(9) + 1;
	}

	int getNum1() {
		return num1;
	}

	int getNum2() {
		return num2;
	}

	int getKotae() {
		return num1*num2;
	}

	boolean check(int kotae) {
		if(kotae == this.getKotae()) {
			return true;
		}else {
			return false;
		}
	}

}
