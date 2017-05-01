import java.text.SimpleDateFormat;
import java.util.Date;

public class TableGetterDummy<T> {

	@SuppressWarnings({ "null", "deprecation" })
	public static void main(String[] args) {
//		DaoFactory dao = new DaoFactory();
//		System.out.println(dao.getSessionFactory().openSession().createQuery("FROM Sessions WHERE attendanceId = 10000").list());
		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String dt = "2017-04-05 19:30:00.0".substring(0, 19).replace('-', '/');
		System.out.println(dt);
		
		Date date = new Date(dt);
		System.out.println(date);
		System.out.println(df.format(date));
	}

}
