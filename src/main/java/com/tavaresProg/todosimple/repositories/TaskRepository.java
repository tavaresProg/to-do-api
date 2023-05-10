package com.tavaresProg.todosimple.repositories;

import com.tavaresProg.todosimple.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
