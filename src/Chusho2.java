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
	System.out.println(s);

	Sankaku s1 = new Sankaku(5,10);
	Sankaku s2 = new Sankaku(5,10);

	if( s1 == s2 ){
	    System.out.println("同じ");
	}else{
	    System.out.println("違う");
	}

	if( s1.equals(s2) ){
	    System.out.println("同じ");
	}else{
	    System.out.println("違う");
	}
	}
}
