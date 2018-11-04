import java.net.*;
import java.io.*;

class UDPServer{

	public static void main(String argv[])throws IOException{
		DatagramSocket ds=new DatagramSocket(5462);
		FileOutputStream fout=new FileOutputStream("test1.txt");
		byte b[]=new byte[1024];
		
		while(true){
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String str=new String(new String(dp.getData(),0,dp.getLength()));
			
			if(str.trim().equals("END"))
				break;
			fout.write(b);
		}
			System.out.println("File Receieved Successfully");
		fout.close();
		ds.close();
	}
}
