class Book extends Shouhin{
	private String author;

	public Book() {
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	void showAuthor(){
		System.out.println(author);
	}
}
