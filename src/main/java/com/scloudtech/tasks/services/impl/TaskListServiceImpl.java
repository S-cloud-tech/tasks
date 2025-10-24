package com.scloudtech.tasks.services.impl;

import com.scloudtech.tasks.domain.entities.TaskList;
import com.scloudtech.tasks.repositories.TaskListRepositiory;
import com.scloudtech.tasks.services.TaskListService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepositiory taskListRepositiory;

    public TaskListServiceImpl(TaskListRepositiory taskListRepositiory) {
        this.taskListRepositiory = taskListRepositiory;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepositiory.findAll();
    }

    @Override
    public TaskList createTaskList(TaskList taskList) {
        if (null != taskList.getId()){
            throw new IllegalArgumentException("Task List already has an ID!");
        }
        if (null == taskList.getTitle() || taskList.getTitle().isBlank()){
            throw new IllegalArgumentException("Task List Title must be present");
        }

        LocalDateTime now = LocalDateTime.now();
        taskListRepositiory.save(new TaskList(
                null,
                taskList.getTitle(),
                taskList.getDescription(),
                null,
                now,
                now
        ));

        return null;
    }

    @Override
    public Optional<TaskList> getTaskList(UUID id) {
        return taskListRepositiory.findById(id);
    }

    @Override
    public TaskList updateTaskList(UUID taskListId, TaskList taskList) {
        if (null == taskList.getId()){
            throw new IllegalArgumentException("Task list must have an ID");
        }

        if (!Objects.equals(taskList.getId(), taskListId)){
            throw new IllegalArgumentException("Attempting to change list id, this is not permitted");
        }

        TaskList existingTaskList = taskListRepositiory.findById(taskListId).orElseThrow(() ->
                new IllegalArgumentException("Task list not found"));

        existingTaskList.setTitle(taskList.getTitle());
        existingTaskList.setDescription(taskList.getDescription());
        existingTaskList.setUpdated(LocalDateTime.now());
        return taskListRepositiory.save(existingTaskList);
    }
}
