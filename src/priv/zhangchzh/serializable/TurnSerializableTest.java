package priv.zhangchzh.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TurnSerializableTest {
	public static void main(String[] args) {
		File f = new File("C:/TEST/ioAndXml/student.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student stu_1 = (Student) ois.readObject();
			Student stu_2 = (Student) ois.readObject();
			System.out.println("ss");
			System.out.println(stu_1.age);
			System.out.println(stu_1.name);
			System.out.println(stu_1.num);
			System.out.println(stu_1.score);
		} catch (Exception e) {
			System.out.println("fl");
		}
	}
}
