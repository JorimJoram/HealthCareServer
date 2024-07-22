package com.example.demo.api.account

import com.example.demo.data.Account
import com.example.demo.service.AccountService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountRestApi(
    private val accountService: AccountService
) {
    @PostMapping("/create")
    fun createAccount(@RequestBody account: Account):Account{
        return accountService.createAccount(account)
    }
}