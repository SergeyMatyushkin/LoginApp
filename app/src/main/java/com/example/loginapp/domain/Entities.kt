package com.example.loginapp.domain

data class User(
    val name: String,
    val person: Person,
    val login: String,
    val password: String,
    val id: Int,
)

data class Person(
    val name: String,
    val email: String,
    val id: String,
)

