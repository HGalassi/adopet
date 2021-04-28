package com.example.adopet.helper

import android.R
import android.content.Context
import android.widget.ArrayAdapter
import android.widget.Spinner

class FillSpinner(var spinner: Spinner) {

    fun customSpinnerFiller(context: Context, values: ArrayList<Any>){
        spinner.adapter = ArrayAdapter<Any>(
                context,
                R.layout.simple_spinner_dropdown_item,
                values
        )
    }
}