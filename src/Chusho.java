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
	}
}
