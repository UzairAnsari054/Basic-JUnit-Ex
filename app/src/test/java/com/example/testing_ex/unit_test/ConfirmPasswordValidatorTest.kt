package com.example.testing_ex.unit_test

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class ConfirmPasswordValidatorTest {

    private val confirmPasswordValidator = ConfirmPasswordValidator()

    @Test
    fun `password and confirm password are equal, return true`() {
        val result = confirmPasswordValidator.invoke("Password123456", "Password123456")
        assertThat(result).isTrue()
    }

    @Test
    fun `password and confirm password are not equal, return false`() {
        val result = confirmPasswordValidator.invoke("Password123", "Password123456")
        assertThat(result).isFalse()
    }
}