package com.shiva.Interface.Class;

import org.springframework.stereotype.Component;

import com.shiva.Interface.Notification;

@Component("sms")
public class SMSNotification implements Notification
{

	@Override
	public String Notification() {
		
		return "SMS Notification Sent Successfully.";
	}

}
