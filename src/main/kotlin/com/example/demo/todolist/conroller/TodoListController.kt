package com.example.demo.todolist.conroller

import com.example.demo.todolist.conroller.request.CreateTodoListRequest
import com.example.demo.todolist.conroller.response.TodoListResponse
import com.example.demo.todolist.service.TodoListService
import com.example.demo.todolist.service.dto.TodoListDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/todo-list")
class TodoListController(
    private val todoListService: TodoListService
) {

    @PostMapping
    fun createTodoList(
        @RequestBody request: CreateTodoListRequest,
    ) : ResponseEntity<TodoListResponse>{
         val result = todoListService.createTodoList(
                TodoListDto(
                    title = request.title,
                    description = request.description,
                    userName = request.userName,
                )
            )
        return ResponseEntity.status(200).body(
            TodoListResponse(
                id = result.id!!,
                title = result.title,
                description = result.description,
                userName = result.userName,
                createdAt = result.createdAt!!,
            )
        )
    }

    @GetMapping("{id}")
    fun getTodoList(
        @PathVariable id:Long
    ):ResponseEntity<TodoListResponse>{
        val result = todoListService.getTodoList(id)

        return ResponseEntity.status(200).body(
            TodoListResponse(
                id = result.id!!,
                title = result.title,
                description = result.description,
                userName = result.userName,
                createdAt = result.createdAt!!,
            )
        )
    }
}