package mz.gov.inagegpjnotificationservice.resource;

import jakarta.validation.Valid;
import mz.gov.inagegpjnotificationservice.mapper.NotificationMapper;
import mz.gov.inagegpjnotificationservice.resource.dto.NotificationDTO;
import mz.gov.inagegpjnotificationservice.service.INotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.spring6.templateresource.SpringResourceTemplateResource;

@RestController
@RequestMapping("/api/v1.0/notification")
public class NotificationResource {

    private final INotificationService notificationService;

    private final NotificationMapper notificationMapper;

    public NotificationResource(INotificationService notificationService, NotificationMapper notificationMapper) {
        this.notificationService = notificationService;
        this.notificationMapper = notificationMapper;
    }

    @PostMapping
    public String sendNotification(@RequestBody @Valid NotificationDTO notificationDTO){
        return notificationService.sendNotification(notificationMapper.fromDTO(notificationDTO));
    }
}
