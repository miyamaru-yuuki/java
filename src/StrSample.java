import java.util.Calendar;
import java.util.Date;
public class StrSample {

	public static void main(String[] args) {
		String str = "1,りんご,100";
		String[] shouhinAry = str.split(",");
		int tankaDouble = Integer.parseInt(shouhinAry[2]) * 2;
		System.out.println(tankaDouble);

		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		System.out.println(sdf.format(d));
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int month = c.get(Calendar.MONTH);
		month = month + 1;
		System.out.println(month);
	}
}
