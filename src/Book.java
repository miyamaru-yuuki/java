class Book extends Shouhin{
	private int sid;
	private String sname;
	private int tanka;
	private String author;

	public Book() {
		System.out.println("Book()");
	}

	public Book(int sid, String sname, int tanka,String author) {
		System.out.println("Book(int sid, String sname, int tanka,String author)");
		this.sid = sid;
		this.sname = sname;
		this.tanka = tanka;
		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	void showAuthor(){
		System.out.println(author);
	}
}
