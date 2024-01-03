package com.example.demo.todolist.service

import com.example.demo.todolist.service.dto.TodoListDto
import org.springframework.stereotype.Service

@Service
class TodoListService {
    fun createTodoList(todoListDto: TodoListDto): String{
        return todoListDto.title
    }
}