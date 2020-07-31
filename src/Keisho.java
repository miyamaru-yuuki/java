public class Keisho {
	public static void main(String[] args) {
		Shouhin s = new Shouhin();
		s.setSid(5);
		s.setSname("もも");
		s.setTanka(300);
		s.show();
		
		Book b = new Book();
		b.showAuthor();
	}
}
