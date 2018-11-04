import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;



public class caseClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress ip=InetAddress.getLocalHost();
		int port=1234;
		Socket s=new Socket(ip,port);
		
		Scanner sc=new Scanner(System.in);
		
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		
		System.out.println("Enter word");
		
		String str=sc.nextLine();
		System.out.println("Send");
		dos.writeUTF(str);
		
		
		
		str=dis.readUTF();
		System.out.println("In Capital:"+str);

		s.close();
		
		

	}

}
