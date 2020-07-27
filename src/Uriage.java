
public class Uriage {
	private int uid;
	private int kosu;
	private Shouhin shouhin;

	public Uriage(int uid, int kosu, Shouhin shouhin) {
		super();
		this.uid = uid;
		this.kosu = kosu;
		this.shouhin = shouhin;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getKosu() {
		return kosu;
	}

	public void setKosu(int kosu) {
		this.kosu = kosu;
	}

	void show(){
		System.out.println(uid);
		System.out.println(kosu);
		System.out.println(shouhin.getSname());
	}
}
