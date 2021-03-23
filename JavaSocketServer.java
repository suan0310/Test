package chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaSocketServer {

	public static void main(String[] args) {
		try {
		int port = 5001;
		System.out.println("starting java socket server...");
			
		ServerSocket aServerSocket = new ServerSocket(port);
		System.out.println("Listening at port"+ port);
		
		while(true) {
			Socket sock = aServerSocket.accept();
			InetAddress clienHost = sock.getLocalAddress();
			int clientport = sock.getPort();
			System.out.println("A client connected.host : "+ clienHost);
			System.out.println("port : "+clientport);
			
			ObjectInputStream instream = new ObjectInputStream(sock.getInputStream());
			Object obj;
			obj = instream.readObject();
			System.out.println("input : " +obj);
			
			ObjectOutputStream outstream = new ObjectOutputStream(sock.getOutputStream());
			outstream.writeObject(obj+ " from server");
			outstream.flush();
			sock.close();
		}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}

}
