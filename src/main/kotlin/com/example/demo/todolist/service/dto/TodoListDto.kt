package com.example.demo.todolist.service.dto

import java.time.ZonedDateTime

data class TodoListDto(
    val title: String,
    val description: String,
    val userName: String,
    val createAt: ZonedDateTime?= null,
)
