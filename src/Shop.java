import java.util.ArrayList;

public class Shop {
	public Shop() {
		super();
		this.list = new ArrayList<Shouhin>();
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
