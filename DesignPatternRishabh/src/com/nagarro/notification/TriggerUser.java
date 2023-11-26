package com.nagarro.notification;

/**
 * Trigger User class implements Observer interface for updating the
 * notification message
 */
public class TriggerUser implements Observer {

	private String name;

	public TriggerUser(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + " has received the notification " + message);
	}
}
