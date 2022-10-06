package com.notification.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class NotificationTemplate {

    @Id
    private int id;
    private String template_name;
    private String template_text;
    private String module;
    private Boolean is_active;
    private String external_name;

}
