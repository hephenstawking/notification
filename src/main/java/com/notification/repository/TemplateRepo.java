package com.notification.repository;

import com.notification.entity.NotificationTemplate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TemplateRepo extends CrudRepository<NotificationTemplate, Integer> {

    List<NotificationTemplate> getTemplatesByModule(String module);

}
