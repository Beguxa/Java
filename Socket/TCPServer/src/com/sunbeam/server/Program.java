package com.sunbeam.server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Program
{
	public static void main(String[] args)
	{
		final int port = 23783;
		ServerSocket server = null;
		DataInputStream inputStream = null;
		DataOutputStream outputStream = null;
		BufferedReader reader = null;
		try
		{
			server = new ServerSocket(port);
			Socket client = server.accept();
			inputStream = new DataInputStream(client.getInputStream());
			outputStream = new DataOutputStream(client.getOutputStream());
			String text = "";
			reader = new BufferedReader(new InputStreamReader(System.in));
			do
			{
				System.out.print("Server	:	");
				text = reader.readLine();
				outputStream.writeUTF(text);
				outputStream.flush();
				
				text = inputStream.readUTF();
				System.out.println("Client	:	"+text);	
			}while( !( text.equals("end")));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if( reader != null )
					reader.close();
				if( inputStream != null )
					inputStream.close();
				if(outputStream != null )
					outputStream.close();
				if( server != null )
					server.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
