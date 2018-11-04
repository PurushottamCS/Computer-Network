import java.net.*;
import java.io.*;

class UDPClient{

	public static void main(String argv[])throws IOException{
		DatagramSocket ds=new DatagramSocket();
		FileInputStream fin=new FileInputStream("test.txt");
		byte b[]=new byte[1024];
		
		DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getLocalHost(),5462);
		int count=0;
		while((count=fin.read(b))!=-1){
			ds.send(dp);
			if(count==0){
				b="END".getBytes();
				ds.send(dp);
			}
		}
		System.out.println("File Send Successfully");
		fin.close();
		ds.close();

		
	}
}
