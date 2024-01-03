package com.example.demo.todolist.conroller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class CreateTodoListRequest(
    val title: String,
    val description: String,
    val userName: String,
)
@RestController
@RequestMapping("/api/v1/todo-list")
class TodoListController {

    @PostMapping
    fun createTodoList(
        @RequestBody request: CreateTodoListRequest,
    ) : ResponseEntity<String>{
        return ResponseEntity.status(200).body("success")
    }
}