package com.autism;

import com.autism.notification.INotificationRepository;
import com.autism.notification.INotificationservice;
import com.autism.notification.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Communicator {


    private static final Logger Logger = LoggerFactory.getLogger(Communicator.class);


    public static void main(String[] args) {


        // need to implement a restful layer to receive the input and send the message across
        final INotificationservice notificationService = new NotificationService();
        notificationService.send("TEST");

    }
}
