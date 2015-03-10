package com.autohome.guava.eventbus.exmaple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class UserThread extends Thread{
	
	private Socket connection;
	private EventBus channel;
	private BufferedReader in;
	private PrintWriter out;
	
	public UserThread(Socket connection, EventBus channel){
		this.channel = channel;
		this.connection = connection;
		
		try {
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			out = new PrintWriter(connection.getOutputStream(),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	@Subscribe
	public void recieveMessage(String message){
		if(out != null){
			out.println(message);
			System.out.println("receiveMessage:"+ message);
		}
	}

	@Override
	public void run() {
		String input;
		try {
			while((input = in.readLine()) != null){
				channel.post(input);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//reached eof
		channel.unregister(this);
		try {
			connection.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		in = null;
		out = null;
	}

	
}
