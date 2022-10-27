package com.aurionpro.test;

import com.aurionpro.model.CollectionIterator;
import com.aurionpro.model.Notification;
import com.aurionpro.model.NotificationBar;
import com.aurionpro.model.NotificationCollection;

public class NotificationTest {

	public static void main(String[] args) {
//		NotificationCollection nc = new NotificationCollection();
//        NotificationBar nb = new NotificationBar(nc);
//        nb.printNotifications();
////        ----------------
        
        NotificationCollection notifications = new NotificationCollection();
        CollectionIterator iterator = notifications.createIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext())
        {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
	}

}
