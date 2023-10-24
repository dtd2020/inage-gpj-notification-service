package mz.gov.inagegpjnotificationservice.service;

import mz.gov.inagegpjnotificationservice.entities.Notification;
import mz.gov.inagegpjnotificationservice.entities.enums.SendMeanType;

public interface ISendEngine {
    String sendMessage(Notification notification);

    SendMeanType meanType();
}
