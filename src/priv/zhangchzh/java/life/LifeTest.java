package priv.zhangchzh.java.life;

import java.util.HashSet;

public class LifeTest {
	public static void main(String[] args) {
		Teacher t = new Teacher("Maker",new HashSet<>());

		Student s1 = new Student("student1",null);
		Student s2 = new Student("student2",null);

//		s1.getTeacher(t);
//		t.getStudnet().add(s1);


		s1 = null;
		s2 = null;
		t = null;
	}
}
