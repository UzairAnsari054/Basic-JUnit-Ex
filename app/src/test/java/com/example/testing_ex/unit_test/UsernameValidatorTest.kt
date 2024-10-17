package com.example.testing_ex.unit_test

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class UsernameValidatorTest {

    private val usernameValidator = UsernameValidator()

    @Test
    fun `validate username with a empty username, returns false` (){
        val isValid = usernameValidator.invoke("")
        assertThat(isValid).isFalse()
    }

    @Test
    fun `validate username with a username that has space, returns false` (){
        val isValid = usernameValidator.invoke("Uzair Ansari")
        assertThat(isValid).isFalse()
    }

    @Test
    fun `validate username with a username that is already taken, returns false` (){
        val isValid = usernameValidator.invoke("Username1")
        assertThat(isValid).isFalse()
    }

    @Test
    fun `validate username with a valid username, returns true` (){
        val isValid = usernameValidator.invoke("Uzair")
        assertThat(isValid).isTrue()
    }
}

//@Test
//fun `what the function is about, returns true` (){}