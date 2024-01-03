package com.example.demo.todolist.repository.model

import com.example.demo.todolist.service.dto.TodoListDto
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.ZonedDateTime

@Entity
class TodoList(
    @Column(name = "title")
    private var title: String? = null,

    @Column(name = "description")
    private var description: String? = null,

    @Column(name = "user_name")
    private var userName: String? = null,

    @Column(name = "create_at")
    private var createdAt: ZonedDateTime? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null

    fun toDto(): TodoListDto{
        return TodoListDto(
            id = this.id!!,
            title = this.title!!,
            description = this.description!!,
            userName = this.userName!!,
            createdAt = this.createdAt!!
        )
    }
}