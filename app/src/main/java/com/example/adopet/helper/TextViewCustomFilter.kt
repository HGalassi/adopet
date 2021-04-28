package com.example.adopet.helper

import android.text.InputFilter
import android.widget.TextView

class TextViewCustomFilter(val textView : TextView) {

    fun textViewMaxLenght(maxLenght : Int) {
        textView.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(maxLenght))
    }

    fun isEmailValid(): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(textView.text).matches()
    }
}