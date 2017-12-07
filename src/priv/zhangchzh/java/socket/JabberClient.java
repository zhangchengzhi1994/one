package priv.zhangchzh.java.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class JabberClient{
	final static int PORT = 9999;
	public static void main(String[] args) throws IOException {
		InetAddress addr = InetAddress.getByAddress(null);
		System.out.println("addr = " + addr);
		Socket socket = 
			      new Socket(addr, 9999);
			    // Guard everything in a try-finally to make
			    // sure that the socket is closed:
			    try {
			      System.out.println("socket = " + socket);
			      BufferedReader in =
			        new BufferedReader(
			          new InputStreamReader(
			            socket.getInputStream()));
			      // Output is automatically flushed
			      // by PrintWriter:
			      PrintWriter out =
			        new PrintWriter(
			          new BufferedWriter(
			            new OutputStreamWriter(
			              socket.getOutputStream())),true);
			      for(int i = 0; i < 10; i ++) {
			        out.println("howdy " + i);
			        String str = in.readLine();
			        System.out.println(str);
			      }
			      out.println("END");
			    } finally {
			      System.out.println("closing...");
			      socket.close();
			    }
	}
}
