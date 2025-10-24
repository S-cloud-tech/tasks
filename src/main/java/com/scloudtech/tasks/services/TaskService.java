package com.scloudtech.tasks.services;

import com.scloudtech.tasks.domain.entities.Task;

import java.util.List;

public interface TaskService {
    List<Task> listTasks();
}
