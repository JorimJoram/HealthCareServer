package com.example.demo.data

import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface AccountRepository:JpaRepository<Account, Long> {
    fun findByUsername(username:String):Optional<Account>
    fun findByPhone(phone:String):Optional<Account>

    fun deleteByUsername(username:String):Unit
}