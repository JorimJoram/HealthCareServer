package com.example.demo.api.account

import com.example.demo.service.AccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * 존재한다면 false, 존재하지 않는다면 true
 */
@RestController
@RequestMapping("/account/check")
class AccountCheckRestApi(
    private val accountService: AccountService
) {
    @GetMapping("/dup/username")
    fun checkUsernameDuplicate(@RequestParam(name = "username")username:String): Boolean {
        return accountService.getAccountByUsername(username).username == "none"
    }

    @GetMapping("/dup/phone")
    fun checkPhoneDuplicate(@RequestParam(name = "phone")phone:String): Boolean {
        return accountService.getAccountByPhone(phone).username == "none"
    }
}