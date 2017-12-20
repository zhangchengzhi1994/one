package priv.zhangchzh.java.life;

public class Student {
	String sname;
    Teacher teachrer;
	
    public Student(String sname,Teacher teacher) {
		this.sname = sname;
		this.teachrer = teachrer;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Teacher getTeachrer() {
		return teachrer;
	}

	public void setTeachrer(Teacher teachrer) {
		this.teachrer = teachrer;
	}
	
    
}

