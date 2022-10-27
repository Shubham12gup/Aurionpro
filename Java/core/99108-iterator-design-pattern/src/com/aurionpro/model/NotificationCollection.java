package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class NotificationCollection implements Collection {
	
	Notification notification;
	List<Notification> notificationList;
	
	
	public NotificationCollection() {
		notificationList = new ArrayList<Notification>();
		notificationList.add(new Notification("Notification 1"));
		notificationList.add(new Notification("Notification 2"));
		notificationList.add(new Notification("Notification 3"));
		
	}

	public List<Notification> getNotificationList() {
		return notificationList;
	}


	@Override
	public CollectionIterator createIterator() {
		return new NotificationIterator(notificationList);
	}

}
