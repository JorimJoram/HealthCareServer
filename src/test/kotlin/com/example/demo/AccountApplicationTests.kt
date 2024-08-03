package com.example.demo

import com.example.demo.data.Account
import com.example.demo.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.Test

@SpringBootTest
class AccountApplicationTests(
    @Autowired private val accountService: AccountService
) {
    @Test
    fun createAccount(){
        accountService.setAccount(
            Account(
                username="jorimjoram",
                password = "1234",
                name="장효림",
                phone="01012341234",
                license = "t-12341234",
                birth = "970330",
                gender = 1
            )
        )
    }

}