package com.example.demo.todolist.conroller.request

data class CreateTodoListRequest(
    val title: String,
    val description: String,
    val userName: String,
)
