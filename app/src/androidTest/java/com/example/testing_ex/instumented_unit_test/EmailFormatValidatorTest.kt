package com.example.testing_ex.instumented_unit_test

import androidx.test.platform.app.InstrumentationRegistry
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class EmailFormatValidatorTest {
    private lateinit var emailFormatValidator: EmailFormatValidator

    @Before
    fun setUp() {
        val context = InstrumentationRegistry.getInstrumentation().context
        emailFormatValidator = EmailFormatValidator(context)
    }

    @After
    fun tearDown() {

    }

    @Test
    fun validateEmailWithValidEmail_returnsTrue() {
        val isValid = emailFormatValidator.invoke("email@gmail.com")
        assertThat(isValid).isTrue()
    }

    @Test
    fun validateEmailWithEmptyEmail_returnsFalse() {
        val isValid = emailFormatValidator.invoke("")
        assertThat(isValid).isFalse()
    }

    @Test
    fun validateEmailWithInValidEmail_returnsFalse() {
        val isValid = emailFormatValidator.invoke("xyz@")
        assertThat(isValid).isFalse()
    }
}