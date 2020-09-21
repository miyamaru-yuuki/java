import java.util.ArrayList;

public class Chusho {
	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(new Dog("ポチ"));
		list.add(new Cat("ミケ"));
		list.add(new Bird("ピヨ"));

		for(Animal a : list){
			a.naku();
		}

		ArrayList<Runner> list2 = new ArrayList<Runner>();
		list2.add(new Dog("クロ"));
		list2.add(new Cat("タマ"));
		list2.add(new Robot("ロボ"));

		for(Runner r : list2){
			r.run();
		}
	}
}
