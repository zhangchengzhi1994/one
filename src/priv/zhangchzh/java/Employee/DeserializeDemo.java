package priv.zhangchzh.java.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args) throws Exception{
		Employee e = null;
		FileInputStream fileIn = new FileInputStream("employee.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		e = (Employee) in.readObject();
		in.close();
        fileIn.close();
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
	}
}
