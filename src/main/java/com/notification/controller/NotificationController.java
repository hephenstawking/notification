package com.notification.controller;

import com.notification.entity.NotificationTemplate;
import com.notification.dto.NotificationTemplateDTO;
import com.notification.mapper.NotificationTemplateMapper;
import com.notification.repository.TemplateRepo;
import com.notification.service.NotificationTemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/v1/notification")
@RequiredArgsConstructor
@Slf4j
public class NotificationController {

    private final NotificationTemplateService templateService;

    @GetMapping(value = "/template")
    public List<NotificationTemplateDTO> getTemplates(@RequestParam String module) {
        return templateService.getTemplateByModuleId(module);
    }

}
