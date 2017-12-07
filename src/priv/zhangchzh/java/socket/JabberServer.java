package priv.zhangchzh.java.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class JabberServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9999);  //设置端口号
		System.out.println("started"+ss);
		try{
			Socket socket = ss.accept();
		try {
			System.out.println("Connection accepted:"+socket);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			while (true) {  
		          String str = in.readLine();
		          if (str.equals("END")) break;
		          System.out.println("Echoing: " + str);
		          out.println(str);
		        }
		      // Always close the two sockets...
		      } finally {
		        System.out.println("closing...");
		        socket.close();
		      }
		    } finally {
		      ss.close();
		    }
		}
	}
