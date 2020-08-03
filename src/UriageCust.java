
public class UriageCust extends Uriage{

	private String customer;

	public UriageCust(int uid,int kosu,Shouhin shouhin,String customer) {
		super(uid,kosu,shouhin);
		System.out.println("UriageCust(int uid,int kosu,Shouhin shouhin,String customer)");
		this.customer = customer;
	}

	void show(){
		super.show();
		System.out.println(customer);
	}
}
