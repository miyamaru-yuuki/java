import java.util.ArrayList;

public class Shop {
	private ArrayList<Shouhin> list;
	public Shop(ArrayList<Shouhin> list) {
		super();
		this.list = list;
	}
	void add(Shouhin s) {
		this.list.add(s);
	}
	void show(){
		for(Shouhin s : list){
			System.out.println(s.getSname());
		}
	}
	int goukei() {
		int goukei = 0;
		for(Shouhin s : list){
			goukei = goukei + s.getTanka();
		}
		return goukei;
	}
}
