package com.example.nycschools.fragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SchoolsDetailFragmentArgs(
  public val dbn: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("dbn", this.dbn)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("dbn", this.dbn)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SchoolsDetailFragmentArgs {
      bundle.setClassLoader(SchoolsDetailFragmentArgs::class.java.classLoader)
      val __dbn : String?
      if (bundle.containsKey("dbn")) {
        __dbn = bundle.getString("dbn")
      } else {
        throw IllegalArgumentException("Required argument \"dbn\" is missing and does not have an android:defaultValue")
      }
      return SchoolsDetailFragmentArgs(__dbn)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SchoolsDetailFragmentArgs {
      val __dbn : String?
      if (savedStateHandle.contains("dbn")) {
        __dbn = savedStateHandle["dbn"]
      } else {
        throw IllegalArgumentException("Required argument \"dbn\" is missing and does not have an android:defaultValue")
      }
      return SchoolsDetailFragmentArgs(__dbn)
    }
  }
}
