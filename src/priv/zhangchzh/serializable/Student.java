package priv.zhangchzh.serializable;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	int age;
	String num;
	double score;

	public Student(String name, int age, String num, double score) {
		this.age = age;
		this.name = name;
		this.num = num;
		this.score = score;
	}

//	public String toString() {
//		return name + "\t" + age + "\t" + num + "\t" + score;
//	}

}
