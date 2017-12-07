package priv.zhangchzh.java.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MoreStream {
	public static void main(String[] args) throws IOException {
        // 节点流FileOutputStream直接以A.txt作为数据源操作
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Administrator/Desktop/a.txt");
        // 过滤流BufferedOutputStream进一步装饰节点流，提供缓冲写
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                fileOutputStream);
        // 过滤流DataOutputStream进一步装饰过滤流，使其提供基本数据类型的写
        DataOutputStream out = new DataOutputStream(bufferedOutputStream);
        out.writeInt(3);
        out.writeBoolean(true);
        out.flush();
        out.close();
        // 此处输入节点流，过滤流正好跟上边输出对应，读者可举一反三
        DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream("A.txt")));
        System.out.println(in.readInt());
        System.out.println(in.readBoolean());
        in.close();
}
}
