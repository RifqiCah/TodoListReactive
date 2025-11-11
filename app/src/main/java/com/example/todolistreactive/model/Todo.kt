package com.example.todolistreactive.model

data class Todo(
    val id: Int,
    val title: String,
    val isDone: Boolean = false
)
