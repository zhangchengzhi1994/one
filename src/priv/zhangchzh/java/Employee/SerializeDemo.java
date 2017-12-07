package priv.zhangchzh.java.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) throws IOException{
		Employee e = new Employee();
		e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        
        FileOutputStream fileOut = new FileOutputStream("employee.ser");//新建文件和文件对象
        ObjectOutputStream out = new ObjectOutputStream(fileOut);//生成objectOps对象
        out.writeObject(e);//将e对象序列化并写入
        out.close();//关闭oos对象
        fileOut.close();//文件对象关闭
        System.out.printf("Serialized data is saved in /tmp/employee.ser");//成功标志
	}
}
