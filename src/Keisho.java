public class Keisho {
	public static void main(String[] args) {
//		Book b = new Book();
//		b.show();
		Shouhin s = new Book();
//		s.show();
		UriageCust uc = new UriageCust(1,5,s,"田中");
		uc.show();
		Uriage u = new UriageCust(1,5,s,"田中");
		u.show();
	}
}