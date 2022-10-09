package com.notification.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationTemplateDTO {

    private int id;
    private String templateName;
    private String templateText;
    private String externalName;

}
