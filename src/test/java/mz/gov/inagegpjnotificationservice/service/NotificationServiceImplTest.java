package mz.gov.inagegpjnotificationservice.service;

import mz.gov.inagegpjnotificationservice.entities.Notification;
import mz.gov.inagegpjnotificationservice.entities.enums.MessageStatus;
import mz.gov.inagegpjnotificationservice.entities.enums.SendMeanType;
import mz.gov.inagegpjnotificationservice.repos.INotificationRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceImplTest {
    @InjectMocks
    private NotificationServiceImpl notificationService;
    @Mock
    private INotificationRepository notificationRepository;
    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp(){
        autoCloseable = MockitoAnnotations.openMocks(this);
    };
    @AfterEach
    void close() throws Exception {
        autoCloseable.close();
    }

    @Test
    void createNotification() {
        Notification notification = new Notification();
        notification.setNotificationReference("ref1");
        notification.setSendMeanType(SendMeanType.SMS);
        notification.setDestiny("Destino");
        notification.setMessageText("Texto da notificaccão");
        notification.setMessageStatus(MessageStatus.PENDING);
        notificationService.createNotification(notification);

        Mockito.verify(notificationRepository).save(notification);
        Mockito.verify(notificationRepository, Mockito.times(1)).save(notification);
    }

    @Test
    void sendNotification() {
        Notification notification = new Notification();
        notification.setNotificationReference("ref1");
        notification.setSendMeanType(SendMeanType.SMS);
        notification.setDestiny("Destino");
        notification.setMessageText("Texto da notificaccão");
        notification.setMessageStatus(MessageStatus.PENDING);

//        Mockito.when(notificationService)

        var result = notificationService.sendNotification(notification);

        Assertions.assertEquals("Enviando SMS...", result);


    }

    @Test
    void findNotificationsByReference() {
    }

    @Test
    void findNotificationByStatus() {
    }
}