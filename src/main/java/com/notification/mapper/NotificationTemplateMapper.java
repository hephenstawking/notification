package com.notification.mapper;

import com.notification.dto.NotificationTemplateDTO;
import com.notification.entity.NotificationTemplate;
import org.springframework.stereotype.Component;

@Component
public class NotificationTemplateMapper {

    public NotificationTemplateDTO toDto(NotificationTemplate template) {
        int id = template.getId();
        String templateName = template.getTemplateName();
        String templateText = template.getTemplateText();
        String externalName = template.getExternalName();

        return new NotificationTemplateDTO(id, templateName, templateText, externalName);
    }

}
