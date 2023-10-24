package mz.gov.inagegpjnotificationservice.resource.dto;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import mz.gov.inagegpjnotificationservice.entities.enums.MessageStatus;
import mz.gov.inagegpjnotificationservice.entities.enums.SendMeanType;

public class NotificationDTO {
    @NotBlank
    private String notificationReference;
    @NotBlank
    private String messageText;
    private String destiny;
    private SendMeanType sendMeanType;
    private MessageStatus messageStatus;

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
}
