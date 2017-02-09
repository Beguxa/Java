package com.sunbeam.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		DatagramSocket socket = null;
		try
		{
			final int port = 9138;
			InetAddress address = InetAddress.getLocalHost();
			
			socket = new DatagramSocket();
			
			byte[] buffer = new byte[1000];
			String message = "";
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			while( true )
			{					
				System.out.print("Client	:	");		
				message = reader.readLine();
				DatagramPacket response = new DatagramPacket(message.getBytes(), message.getBytes().length, address, port);
				socket.send(response);
				
				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				socket.receive(request);
				message = new String(buffer, 0, request.getLength());
				System.out.println("Server	:	"+message);				
			}
		}
		catch (SocketException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(socket != null )
				socket.close();
		}
	}
}
