package com.example.demo.todolist.conroller

import com.example.demo.todolist.service.TodoListService
import com.example.demo.todolist.service.dto.TodoListDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.ZonedDateTime

data class CreateTodoListRequest(
    val title: String,
    val description: String,
    val userName: String,
)

data class CreateTodoListResponse(
    val id: Long,
    val title: String,
    val description: String,
    val userName: String,
    val createdAt: ZonedDateTime,
)

@RestController
@RequestMapping("/api/v1/todo-list")
class TodoListController(
    private val todoListService: TodoListService
) {

    @PostMapping
    fun createTodoList(
        @RequestBody request: CreateTodoListRequest,
    ) : ResponseEntity<CreateTodoListResponse>{
         val result = todoListService.createTodoList(
                TodoListDto(
                    title = request.title,
                    description = request.description,
                    userName = request.userName,
                )
            )
        return ResponseEntity.status(200).body(
            CreateTodoListResponse(
                id = result.id!!,
                title = result.title,
                description = result.description,
                userName = result.userName,
                createdAt = result.createdAt!!,
            )
        )
    }
}