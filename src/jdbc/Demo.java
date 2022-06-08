package jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Demo {

	static String sql = null;
//	static DBClose db = null;

	public static void main(String[] args) {
		sql = "select * from stuinfo";// SQL语句
//		db = new DBClose(sql);
		List<String> list = new ArrayList<String>();
//		list = db.executeBySql();
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
	}
}