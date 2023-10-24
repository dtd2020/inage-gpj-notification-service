package mz.gov.inagegpjnotificationservice.service;

import mz.gov.inagegpjnotificationservice.entities.Notification;
import mz.gov.inagegpjnotificationservice.entities.enums.MessageStatus;
import mz.gov.inagegpjnotificationservice.repos.INotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements INotificationService{
    private final INotificationRepository notificationRepository;

    private final List<ISendEngine> sendEngine;
    @Autowired
    public NotificationServiceImpl(INotificationRepository notificationRepository, List<ISendEngine> sendEngine) {
        this.notificationRepository = notificationRepository;
        this.sendEngine = sendEngine;
    }

    @Override
    public void createNotification(Notification notification) {
        notificationRepository.save(notification);
    }

    @Override
    public String sendNotification(Notification notification) {
//ISendEngine eng = null;
//        for (ISendEngine en: sendEngine) {
//          if(en.meanType()==notification.getSendMeanType()){
//              eng=en;
//          }
//        }
//        assert eng != null;
//        eng.sendMessage(notification);
        var sender = sendEngine.stream().filter(eng->eng.meanType() == notification.getSendMeanType()).findFirst().orElseThrow();
        return sender.sendMessage(notification);

//        if (SendMeanType.SMS == notification.getSendMeanType()){
//
//        }else {
//
//        }
    }

    @Override
    public List<Notification> findNotificationsByReference(String reference) {
        return notificationRepository.findNotificationsByReference(reference);
    }

    @Override
    public List<Notification> findNotificationByStatus(List<MessageStatus> status) {
        return notificationRepository.findNotificationByStatus(status);
    }
}
