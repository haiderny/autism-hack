package com.autism.notification;


import net.pushover.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationRepository implements INotificationRepository {

    private static final Logger Logger = LoggerFactory.getLogger(NotificationRepository.class);

    

    public void toPushover(String message) {

        PushoverClient client = new PushoverRestClient();

        try {
            client.pushMessage(PushoverMessage.builderWithApiToken("MY_APP_API_TOKEN")
                    .setUserId("USER_ID_TOKEN")
                    .setMessage("testing!")
                    .build());

// push a message with optional fields
            Status result = client.pushMessage(PushoverMessage.builderWithApiToken("MY_APP_API_TOKEN")
                    .setUserId("USER_ID_TOKEN")
                    .setMessage("testing!")
                    .setDevice("device")
                    .setPriority(MessagePriority.HIGH) // HIGH|NORMAL|QUIET
                    .setTitle("title")
                    .setUrl("https://github.com/sps/pushover4j")
                    .setTitleForURL("pushover4j github repo")
                    .setSound("magic")
                    .build());
        } catch (Exception e) {
            Logger.error("error received when sending message to pushover: {}", e);
        }


    }


}
