package net.student.dto;

public class ChatRoom {
	private String chatroom_id;
	private String user_id;
	private int class_id;
	
	
	public String getChatroom_id() {
		return chatroom_id;
	}


	public void setChatroom_id(String chatroom_id) {
		this.chatroom_id = chatroom_id;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public int getClass_id() {
		return class_id;
	}


	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
