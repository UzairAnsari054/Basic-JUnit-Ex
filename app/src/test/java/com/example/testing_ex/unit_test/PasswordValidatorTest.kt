package com.example.testing_ex.unit_test

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class PasswordValidatorTest{

    private val passwordValidator = PasswordValidator()

    @Test
    fun `password is empty, returns false`(){
        val result = passwordValidator.invoke("")
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains space, returns false`(){
        val result = passwordValidator.invoke("Pass 1234")
        assertThat(result).isFalse()
    }

    @Test
    fun `password does not contains 8 letters, returns false`(){
        val result = passwordValidator.invoke("Pass1")
        assertThat(result).isFalse()
    }

    @Test
    fun `password does not contains an uppercase letters, returns false`(){
        val result = passwordValidator.invoke("pass123456")
        assertThat(result).isFalse()
    }

    @Test
    fun `password does not contains a digit, returns false`(){
        val result = passwordValidator.invoke("MyPassWord")
        assertThat(result).isFalse()
    }

    @Test
    fun `password is valid, returns true`(){
        val result = passwordValidator.invoke("Password123456")
        assertThat(result).isTrue()
    }


}