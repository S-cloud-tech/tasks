//package com.scloudtech.tasks.controllers;
//
//import com.scloudtech.tasks.domain.dto.TaskDto;
//import com.scloudtech.tasks.mappers.TaskMapper;
//import com.scloudtech.tasks.services.TaskService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/task")
//public class TaskController {
//
//    private final TaskService taskService;
//    private final TaskMapper taskMapper;
//
//    public TaskController(TaskService taskService, TaskMapper taskMapper) {
//        this.taskService = taskService;
//        this.taskMapper = taskMapper;
//    }
//
//    @GetMapping
//    public List<TaskDto> listTasks(){
//        return  taskService.listTasks()
//                .stream()
//                .map(taskMapper::toDto)
//                .toList();
//    }
//}
