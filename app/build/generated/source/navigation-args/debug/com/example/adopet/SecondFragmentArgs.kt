package com.example.adopet

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

data class SecondFragmentArgs(
  val myArg: Int
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("myArg", this.myArg)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): SecondFragmentArgs {
      bundle.setClassLoader(SecondFragmentArgs::class.java.classLoader)
      val __myArg : Int
      if (bundle.containsKey("myArg")) {
        __myArg = bundle.getInt("myArg")
      } else {
        throw IllegalArgumentException("Required argument \"myArg\" is missing and does not have an android:defaultValue")
      }
      return SecondFragmentArgs(__myArg)
    }
  }
}
