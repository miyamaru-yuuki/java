class TasiMondai extends KuKuMondai{

	public TasiMondai() {
	}

	void show(){
		System.out.println(super.getNum1() +"+️️"+ super.getNum2());
	}

	int getKotae() {
		return super.getNum1()+super.getNum2();
	}
}
