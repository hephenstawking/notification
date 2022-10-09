package com.notification.service;

import com.notification.dto.NotificationTemplateDTO;
import com.notification.mapper.NotificationTemplateMapper;
import com.notification.repository.TemplateRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NotificationTemplateService {

    private final TemplateRepo templateRepo;

    private final NotificationTemplateMapper mapper;

    public List<NotificationTemplateDTO> getTemplateByModuleId(String module) {
        return templateRepo.getActiveTemplatesByModule(module)
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

}
