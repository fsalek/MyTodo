package com.fslk.todoapi.repositories;

import com.fslk.todoapi.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
