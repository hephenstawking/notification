package com.notification.repository;

import com.notification.entity.NotificationTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateRepo extends CrudRepository<NotificationTemplate, Integer> {

    List<NotificationTemplate> getTemplatesByModule(String module);

}
