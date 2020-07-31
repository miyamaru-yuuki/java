class Book extends Shouhin{
	private String author;

	public Book() {
		System.out.println("Book()");
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	void showAuthor(){
		System.out.println(author);
	}
}
