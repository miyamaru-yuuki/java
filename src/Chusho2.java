import java.util.ArrayList;

public class Chusho2 {
	public static void main(String[] args) {

	ArrayList<Shape> list = new ArrayList<Shape>();
	list.add(new Sankaku(10,5));
	list.add(new Sankaku(20,5));
	list.add(new En(10));
	list.add(new En(100));

	for(Shape s : list){
		System.out.println(s.getMenseki());
	}

	Sankaku s = new Sankaku(30,5);
	System.out.println(s.toString2());
	}
}
