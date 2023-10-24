package mz.gov.inagegpjnotificationservice.service;

import mz.gov.inagegpjnotificationservice.entities.Notification;
import mz.gov.inagegpjnotificationservice.entities.enums.MessageStatus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface INotificationService {

    void createNotification(Notification notification);
    String sendNotification(Notification notification);
    List<Notification> findNotificationsByReference(String reference);

    List<Notification> findNotificationByStatus(List<MessageStatus> status);

    default List<Notification> findNotificationByStatus(MessageStatus messageStatus){
//        return findNotificationByStatus(Collections.singletonList(messageStatus));
        return findNotificationByStatus(List.of(messageStatus));
    };
}
