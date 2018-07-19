import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String args[]) throws IOException {
		int number;
		String temp = null;
		ServerSocket s1 = new ServerSocket(1306);
		Socket ss = s1.accept();
//		accept number passed by client
		Scanner sc = new Scanner(ss.getInputStream());
		number = sc.nextInt();
		
//	Manipulate data sent by client
//		temp = number*5;
		if (number  ==   2304)
		{
			System.out.println( temp = "RESEARCH METHODOLOGY\n CECILIA OKUMU"
					+ "\n MONDAY");
		}
		else if (number == 2404)
		{
			System.out.println(temp = "PROJECT MANAGEMENT\n PATRICK MUKHONGO"
					+ "\n FRIDAY");
		}
		else if (number == 2305)
		{
			System.out.println(temp = "HUMAN COMPUTER INTERACTION\n Dr. HADULLO"
					+ "\n WEDNESDAY");
		}
		else if (number == 2403)
	{
			System.out.println(temp = "DISTRIBUTED SYSTEMS\n MARTIN KAMAU\n "
					+ "THURSDAY 5PM");
		}
		else if (number == 2411)
		{
			System.out.println(temp = "COMPUTER SECURITY AND CRYPTOGRAPHY\n PETER NGUGI"
					+ "\n SATURDAY");
		}
		else if (number == 2404)
	{
		System.out.println(temp = "BUSINESS PROCESS RE-ENGINEERING\n Dr.SASAKA"
				+ "\n SATURDAY");
		}
		else if(number == 2018)
		{
			System.out.println(temp = "RESEARCH METHODOLOGY\n CECILIA OKUMU"
					+ "\n MONDAY\n" +"HUMAN COMPUTER INTERACTION\n Dr. HADULLO"
					+ "\n WEDNESDAY\n" + "DISTRIBUTED SYSTEMS\n MARTIN KAMAU\n "
					+ "THURSDAY 5PM\n" +  "PROJECT MANAGEMENT\n PATRICK MUKHONGO"
					+ "\n FRIDAY\n" +"BUSINESS PROCESS RE-ENGINEERING\n Dr.SASAKA"
					+ "\n SATURDAY\n" +  "COMPUTER SECURITY AND CRYPTOGRAPHY\n PETER NGUGI"
					+ "\n SATURDAY"  );
		}
			
//		pass result back to client ~ use print stream object
		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp);
	
	}
}
