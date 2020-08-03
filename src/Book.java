class Book extends Shouhin{
	private String author;

	public Book() {
		super(0,"",0);
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
	void show(){
		System.out.println(this.getSid());
		System.out.println(this.getSname());
		System.out.println(this.getTanka());
		System.out.println(author);
	}
}
