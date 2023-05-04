package com.example.nycschools.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.nycschools.R
import kotlin.Int
import kotlin.String

public class SchoolsFragmentDirections private constructor() {
  private data class ActionSchoolsFragmentToSchoolsDetailFragment(
    public val dbn: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_schoolsFragment_to_schoolsDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("dbn", this.dbn)
        return result
      }
  }

  public companion object {
    public fun actionSchoolsFragmentToSchoolsDetailFragment(dbn: String?): NavDirections =
        ActionSchoolsFragmentToSchoolsDetailFragment(dbn)
  }
}
