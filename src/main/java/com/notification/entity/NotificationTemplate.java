package com.notification.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class NotificationTemplate {

    @Id
    private int id;
    private String templateName;
    private String templateText;
    private String module;
    private Boolean isActive;
    private String externalName;

}
