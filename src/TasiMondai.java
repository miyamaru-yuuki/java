class TasiMondai extends Mondai{

	public TasiMondai() {
	}

	public void show(){
		System.out.println(super.getNum1() +"+️️"+ super.getNum2());
	}

	int getKotae() {
		return super.getNum1()+super.getNum2();
	}
}
