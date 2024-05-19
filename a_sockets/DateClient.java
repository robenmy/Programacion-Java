package a_sockets;

import java.net.*;
import java.io.*;

public class DateClient
{
	public static void main(String[] args)  {
		
		Client p = new Client();
		
	}
}

class Client implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// this could be changed to an IP name or address other than the localhost
			while(true){
			Socket sock = new Socket("127.0.0.1",4444);
			InputStream in = sock.getInputStream();
			BufferedReader bin = new BufferedReader(new InputStreamReader(in));

			String line;
			while( (line = bin.readLine()) != null)
				System.out.println(line+"\n");
				
			sock.close();
		}
		}
		catch (IOException ioe) {
				System.err.println(ioe);
		}
		
	}
	
	
}