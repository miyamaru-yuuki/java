class Book extends Shouhin{
	private String author;

	public Book() {
		System.out.println("Book()");
	}

	public Book(int sid, String sname, int tanka,String author) {
		super(sid,sname,tanka);
		System.out.println("Book(int sid, String sname, int tanka,String author)");
		this.author = author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	void showAuthor(){
		System.out.println(author);
	}
}
