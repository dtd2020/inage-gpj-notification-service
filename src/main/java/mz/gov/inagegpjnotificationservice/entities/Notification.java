package mz.gov.inagegpjnotificationservice.entities;

import jakarta.persistence.*;
import mz.gov.inagegpjnotificationservice.entities.enums.MessageStatus;
import mz.gov.inagegpjnotificationservice.entities.enums.SendMeanType;

@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String notificationReference;
    private String messageText;
    private String destiny;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SendMeanType sendMeanType;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private MessageStatus messageStatus = MessageStatus.PENDING;

    public SendMeanType getSendMeanType() {
        return sendMeanType;
    }

    public void setSendMeanType(SendMeanType sendMeanType) {
        this.sendMeanType = sendMeanType;
    }

    public MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(MessageStatus messageStatus) {
        this.messageStatus = messageStatus;
    }

    public String getNotificationReference() {
        return notificationReference;
    }

    public void setNotificationReference(String notificationReference) {
        this.notificationReference = notificationReference;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

}
