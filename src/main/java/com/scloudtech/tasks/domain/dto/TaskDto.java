package com.scloudtech.tasks.domain.dto;

import com.scloudtech.tasks.domain.entities.TaskPriority;
import com.scloudtech.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
