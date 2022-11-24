package test3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Webcrete {
	public static void main(String[] args) throws IOException {
		
		String ip = "192.168.112.7";
		int port = 8080;
		String uri = "/day02/index/jsp";
		
		Socket so = new Socket(ip,port);
		PrintWriter out = new PrintWriter(so.getOutputStream());
		Scanner sc = new Scanner(so.getInputStream());
		
		String request = "";
		request += "GET" + uri + " HTTP/1.1";
		request += "\n";
		
		request += "Host: " + ip + ":8080";
		request += "\r\n";
		
		request += "\r\n";
		
		out.write(request);
		out.flush();
		
		System.out.println(request);
		System.out.println("=====================================");
		
		String response = "";
		
		while(sc.hasNextLine()) {
			response += sc.nextLine();
			response += "\r\n";
		}
		System.out.println(response);
		
		sc.close();
		out.close();
		so.close();
				
		
	}
}
