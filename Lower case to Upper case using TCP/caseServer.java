import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class caseServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket ss=new ServerSocket(1234);
		Socket s=ss.accept();
		
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		
		String str=dis.readUTF();
		System.out.println("Receieved");
		str=str.toUpperCase();
		dos.writeUTF(str);
		
		s.close();
		
		
	}

}
