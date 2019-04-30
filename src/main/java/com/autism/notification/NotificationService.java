package com.autism.notification;

public class NotificationService implements INotificationservice {


    private final INotificationRepository notificationRepository;

    public NotificationService() {  //inject via DI if time permits
      this.notificationRepository = new NotificationRepository();
    }


    public void send(String message) {

        notificationRepository.toPushover(message);

    }
}
