package mz.gov.inagegpjnotificationservice.repos;

import mz.gov.inagegpjnotificationservice.entities.Notification;
import mz.gov.inagegpjnotificationservice.entities.enums.MessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface INotificationRepository extends JpaRepository<Notification, Long> {
    @Query("SELECT n from Notification n WHERE n.notificationReference = :reference")
    List<Notification> findNotificationsByReference(@Param("reference") String reference);

    @Query("SELECT n from Notification n WHERE n.messageStatus IN :status")
    List<Notification> findNotificationByStatus(@Param("status") List<MessageStatus> status);
}
