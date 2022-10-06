package com.notification.repository;

import com.notification.entity.NotificationTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateRepo extends JpaRepository<NotificationTemplate, Integer> {

    @Query("SELECT t FROM NotificationTemplate t WHERE t.is_active = 1 AND module = ?1")
    List<NotificationTemplate> getTemplatesByModule(String module);

}
