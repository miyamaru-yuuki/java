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
		list2.add(new Robot());

		for(Runner r : list2){
			r.run();
		}

		Dog d = new Dog("ポチ");
		String dstr = d.toString();
		System.out.println(dstr);

		System.out.println(d.toString());

		Dog d1 = new Dog("シロ");
		Dog d2 = d1;

		d1.setName("クロ");

		System.out.println(d2);

		if( d1 == d2 ){
		    System.out.println("同じ");
		}else{
		    System.out.println("違う");
		}
	}
}
