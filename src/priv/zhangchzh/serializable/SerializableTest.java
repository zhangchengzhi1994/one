package priv.zhangchzh.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) {
		Student stu_1 = new Student("wjn", 20, "13008135", 90);
		Student stu_2 = new Student("zcz", 23, "13008134", 99);
		
		File f = new File("C:/TEST/ioAndXml/student.xml");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stu_1);
			oos.writeObject(stu_2);
			oos.flush();
			fos.close();
			oos.close();
			System.out.println("111");
		} catch (Exception e) {
			System.out.println("222");
		}
	}
}
