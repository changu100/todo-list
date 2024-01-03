package com.example.demo.todolist.conroller.response

import java.time.ZonedDateTime

data class TodoListResponse(
    val id: Long,
    val title: String,
    val description: String,
    val userName: String,
    val createdAt: ZonedDateTime,
)