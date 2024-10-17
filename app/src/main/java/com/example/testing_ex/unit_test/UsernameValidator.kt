package com.example.testing_ex.unit_test

class UsernameValidator {

    val users = listOf("Username1", "Username2", "Username3")

    operator fun invoke(username: String): Boolean {
        if (username.isEmpty()) {
            return false
        }

        if (username.contains(" ")) {
            return false
        }

        if (users.contains(username)) {
            return false
        }

        return true
    }
}