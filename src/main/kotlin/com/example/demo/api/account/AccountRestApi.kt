package com.example.demo.api.account

import com.example.demo.data.Account
import com.example.demo.service.AccountService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountRestApi(
    private val accountService: AccountService
) {
    @PostMapping("/create")
    fun createAccount(@RequestBody account: Account):Account{
        return accountService.setAccount(account)
    }
    @PutMapping("/mod")
    fun modAccount(@RequestBody account: Account): Account {
        return accountService.modAccount(account)
    }
    @DeleteMapping("/remove")
    fun removeAccount(@RequestParam(name = "username")username:String){
        return accountService.removeAccount(username)
    }
}