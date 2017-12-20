package priv.zhangchzh.java.life;

import java.util.Set;

public class Teacher {
	String   tname;
    Set<Student> students;
	public Teacher(String tname,  Set<Student> students ){
		this.tname = tname;
		this.students = students;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
