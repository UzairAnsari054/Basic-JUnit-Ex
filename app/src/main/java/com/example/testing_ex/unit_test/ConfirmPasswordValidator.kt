package com.example.testing_ex.unit_test

class ConfirmPasswordValidator {

    operator fun invoke(password: String, confirmPassword: String): Boolean {
        return password == confirmPassword
    }
}