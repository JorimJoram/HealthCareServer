package com.example.demo.service

import com.example.demo.data.Account
import com.example.demo.data.AccountRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrElse

@Service
class AccountService(
    private val accountRepository: AccountRepository,
    private val passwordEncoder: PasswordEncoder
) {
    /**
     * 만약 조회되지 않는다면 username="none"으로 처리했습니다.
     */
    fun getAccountByUsername(username:String): Account {
        return accountRepository.findByUsername(username).getOrElse {
            Account(
                username="none",
                password="",
                name = "",
                phone="none",
                license = "",
                birth = "",
                gender = -1
            )
        }
    }

    /**
     * 만약 조회되지 않는다면 phone="none"으로 처리했습니다.
     */
    fun getAccountByPhone(phone:String): Account {
        return accountRepository.findByPhone(phone).getOrElse {
            Account(
                username="none",
                password="",
                name = "",
                phone="none",
                license = "",
                birth = "",
                gender = -1
            )
        }
    }

    fun setAccount(account:Account): Account {
        account.password = passwordEncoder.encode(account.password)
        return accountRepository.save(account)
    }

    fun modAccount(account: Account): Account {
        return accountRepository.save(account)
    }

    fun removeAccount(username: String){
        return accountRepository.deleteByUsername(username)
    }
}