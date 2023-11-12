package mz.gov.inagegpjnotificationservice.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import mz.gov.inagegpjnotificationservice.entities.Notification;
import mz.gov.inagegpjnotificationservice.entities.enums.SendMeanType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class SendEmail implements ISendEngine{

    @Autowired
    private JavaMailSender sender;
    @Override
    public String sendMessage(Notification notification) {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            helper.setTo(notification.getDestiny());
            helper.setSubject("Subject: Notificacao");
            helper.setText(notification.getMessageText());
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        sender.send(message);
        return "Notoficação enviada";
    }

    @Override
    public SendMeanType meanType() {
        return SendMeanType.EMAIL;
    }
}
