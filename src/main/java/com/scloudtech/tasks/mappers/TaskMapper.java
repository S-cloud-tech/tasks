package com.scloudtech.tasks.mappers;

import com.scloudtech.tasks.domain.dto.TaskDto;
import com.scloudtech.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
