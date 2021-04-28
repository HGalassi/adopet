package com.example.adopet

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class SecondFragmentDirections private constructor() {
  companion object {
    fun actionSecondFragmentToFirstFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_SecondFragment_to_FirstFragment)
  }
}
