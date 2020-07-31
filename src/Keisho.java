public class Keisho {
	public static void main(String[] args) {
		Book b = new Book();
		b.setSid(1);
		b.setSname("草枕");
		b.setTanka(500);
		b.setAuthor("夏目漱石");
		b.show();
		b.showAuthor();
	}
}