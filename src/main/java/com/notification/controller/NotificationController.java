package com.notification.controller;

import com.notification.entity.NotificationTemplate;
import com.notification.repository.TemplateRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/notification")
@RequiredArgsConstructor
public class NotificationController {

    @Autowired
    private TemplateRepo templateRepo;

    @GetMapping(value = "/template")
    public List<NotificationTemplate> getTemplates(@RequestParam String module) {
        return templateRepo.getTemplatesByModule(module);
    }

}
