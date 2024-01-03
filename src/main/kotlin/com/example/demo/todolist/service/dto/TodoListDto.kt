package com.example.demo.todolist.service.dto

import java.time.ZonedDateTime

data class TodoListDto(
    val id: Long?= null,
    val title: String,
    val description: String,
    val userName: String,
    val createdAt: ZonedDateTime?= null,
)
