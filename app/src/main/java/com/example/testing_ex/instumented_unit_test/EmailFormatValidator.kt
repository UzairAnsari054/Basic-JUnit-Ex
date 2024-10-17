package com.example.testing_ex.instumented_unit_test

import android.content.Context
import android.util.Patterns

class EmailFormatValidator(private val context: Context) {

    operator fun invoke(email: String): Boolean {
        if (email.isEmpty()) return false
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}