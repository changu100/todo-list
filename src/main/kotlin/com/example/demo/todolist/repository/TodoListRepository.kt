package com.example.demo.todolist.repository

import com.example.demo.todolist.repository.model.TodoList
import org.springframework.data.jpa.repository.JpaRepository

interface TodoListRepository: JpaRepository<TodoList, Long> {
}