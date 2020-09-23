
public class Sankaku implements Shape{

	private int teihen;
	private int takasa;

	public Sankaku(int teihen,int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}

	public int getMenseki() {
		return teihen * takasa / 2;
	}

	public String toString() {
		return "底辺:" + teihen + "高さ:" + takasa;
	}

	public boolean equals(Object obj) {
	    Sankaku other = (Sankaku)obj;

	    if( this.teihen == other.teihen && this.takasa == other.takasa ){
	        return true;
	    }else{
	        return false;
	    }
	}
}
