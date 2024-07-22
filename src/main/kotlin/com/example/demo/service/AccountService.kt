package com.example.demo.service

import com.example.demo.data.Account
import com.example.demo.data.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(
    private val accountRepository: AccountRepository
) {
    fun createAccount(account:Account): Account {
        return accountRepository.save(account)
    }
}