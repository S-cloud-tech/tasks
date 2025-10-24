package com.scloudtech.tasks.mappers;

import com.scloudtech.tasks.domain.dto.TaskListDto;
import com.scloudtech.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
