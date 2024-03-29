package com.example.demo.todolist.service

import com.example.demo.todolist.repository.TodoListRepository
import com.example.demo.todolist.repository.model.TodoList
import com.example.demo.todolist.service.dto.TodoListDto
import org.springframework.stereotype.Service
import java.time.ZonedDateTime

@Service
class TodoListService (
    private val todoListRepository: TodoListRepository
){
    fun createTodoList(todoListDto: TodoListDto): TodoListDto{
        return todoListRepository.save(
            TodoList(
                title = todoListDto.title,
                description = todoListDto.description,
                userName = todoListDto.userName,
                createdAt = ZonedDateTime.now()
            )
        ).toDto()
    }


    fun getTodoList(id:Long): TodoListDto{
        return todoListRepository.findById(id).get().toDto()
    }
}