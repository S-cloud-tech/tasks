package com.scloudtech.tasks.repositories;

import com.scloudtech.tasks.domain.entities.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskListRepositiory extends JpaRepository<TaskList, UUID> {
}
