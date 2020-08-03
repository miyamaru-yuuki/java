public class Keisho {
	public static void main(String[] args) {
//		Book b = new Book(1,"草枕",500,"夏目漱石");
//		b.show();
		Shouhin s = new Shouhin(1,"りんご",300);
		UriageCust u = new UriageCust(1,5,s,"田中");
		u.show();
	}
}