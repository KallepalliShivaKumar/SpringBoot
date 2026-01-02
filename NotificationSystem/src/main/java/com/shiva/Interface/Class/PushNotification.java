package com.shiva.Interface.Class;

import org.springframework.stereotype.Component;

import com.shiva.Interface.Notification;

@Component("push")
public class PushNotification implements Notification
{

	@Override
	public String Notification() {
		
		return "Notification Pushed Successfully.";
	}

}
