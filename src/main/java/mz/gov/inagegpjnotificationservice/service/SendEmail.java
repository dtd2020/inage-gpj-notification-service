package mz.gov.inagegpjnotificationservice.service;

import mz.gov.inagegpjnotificationservice.entities.Notification;
import mz.gov.inagegpjnotificationservice.entities.enums.SendMeanType;
import org.springframework.stereotype.Component;

@Component
public class SendEmail implements ISendEngine{
    @Override
    public String sendMessage(Notification notification) {
        return "Enviando EMAIL...";
    }

    @Override
    public SendMeanType meanType() {
        return SendMeanType.EMAIL;
    }
}
