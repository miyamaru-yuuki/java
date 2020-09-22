public class KuKuMondai extends Mondai{

	public String toString() {
		return super.getNum1() +"✖️"+ super.getNum2();
	}

	int getKotae() {
		return super.getNum1()*super.getNum2();
	}
}
