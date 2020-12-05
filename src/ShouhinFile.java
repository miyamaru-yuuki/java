import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ShouhinFile {
	private String fileName;
	private ArrayList<Shouhin> list;

	public ShouhinFile(String fileName) {
		this.fileName = fileName;
		this.list = new ArrayList<Shouhin>();
	}

	public boolean load() {
		try{
			BufferedReader br = new BufferedReader(new FileReader(this.fileName));
			String line;
			while((line = br.readLine()) != null){
				String[] shouhins = line.split(",");
				this.list.add(new Shouhin(shouhins[0],Integer.parseInt(shouhins[1])));
			}
			br.close();
			return true;
		}catch(IOException e) {
			return false;
		}
	}

	public void add(Shouhin shouhin) {
		this.list.add(shouhin);
	}

	public boolean save() {
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(this.fileName)));
			for (Shouhin s : this.list) {
				pw.println(s.getSname() + "," +s.getTanka());
	        }
			pw.close();
			return true;
		}catch(IOException e) {
			return false;
		}
	}

	public Shouhin get(int index) {
		return this.list.get(index);
	}

	public int size() {
		return this.list.size();
	}
}
