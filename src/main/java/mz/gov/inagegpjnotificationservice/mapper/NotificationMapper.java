package mz.gov.inagegpjnotificationservice.mapper;

import jakarta.persistence.Column;
import mz.gov.inagegpjnotificationservice.entities.Notification;
import mz.gov.inagegpjnotificationservice.resource.dto.NotificationDTO;
import org.springframework.stereotype.Component;

@Component
public class NotificationMapper {

    public Notification fromDTO(NotificationDTO notificationDTO){
        Notification notification = new Notification();
        notification.setNotificationReference(notificationDTO.getNotificationReference());
        notification.setDestiny(notificationDTO.getDestiny());
        notification.setMessageStatus(notificationDTO.getMessageStatus());
        notification.setMessageText(notificationDTO.getMessageText());
        notification.setSendMeanType(notificationDTO.getSendMeanType());

        return notification;
    }
}
