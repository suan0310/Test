package chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class JavaSocketClient {

	public static void main(String[] args) {
		try {
		
			int portnumber=5001;
			Socket sock = new Socket("localhost", portnumber);
		
			ObjectOutputStream outstream = new ObjectOutputStream(sock.getOutputStream());
			outstream.writeObject("hello");
			outstream.flush();
			
			ObjectInputStream instream = new ObjectInputStream(sock.getInputStream());
			
				System.out.println(instream.readObject());
				sock.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}

}
