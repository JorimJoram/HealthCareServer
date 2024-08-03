package com.example.demo.data

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name="Account")
data class Account(
    @Id
    val username:String,
    @Column(name="Password", length = 512, nullable = false)
    var password:String,

    @Column(name="name", nullable = false)
    val name:String,
    @Column(name = "phone", nullable = false, unique = true)
    val phone:String,

    @Column(name="license", nullable = true) //확인 후 true, false 수정바람
    val license:String,
    @Column(name="birth", nullable = false)
    val birth:String,
    @Column(name="gender", nullable = false)
    val gender:Int,

    @Column(name = "created_date", nullable = false)
    val createdDate: LocalDateTime = LocalDateTime.now()
)