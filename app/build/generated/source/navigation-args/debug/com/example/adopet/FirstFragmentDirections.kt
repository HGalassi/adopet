package com.example.adopet

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

class FirstFragmentDirections private constructor() {
  private data class ActionFirstFragmentToSecondFragment(
    val myArg: Int
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_FirstFragment_to_SecondFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("myArg", this.myArg)
      return result
    }
  }

  companion object {
    fun actionFirstFragmentToSecondFragment(myArg: Int): NavDirections =
        ActionFirstFragmentToSecondFragment(myArg)
  }
}
