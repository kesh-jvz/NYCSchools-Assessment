// Generated by view binder compiler. Do not edit!
package com.example.nycschools.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.nycschools.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSchoolsDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView dbnTV;

  @NonNull
  public final ProgressBar loadSchoolData;

  @NonNull
  public final TextView noDataFoundTV;

  @NonNull
  public final TextView numOfSatTestTakers;

  @NonNull
  public final ConstraintLayout resultContainer;

  @NonNull
  public final TextView satCriticalReadingAvgScore;

  @NonNull
  public final TextView satMathAvgScore;

  @NonNull
  public final TextView satWritingAvgScore;

  @NonNull
  public final TextView schoolNamesTV;

  private FragmentSchoolsDetailBinding(@NonNull ConstraintLayout rootView, @NonNull TextView dbnTV,
      @NonNull ProgressBar loadSchoolData, @NonNull TextView noDataFoundTV,
      @NonNull TextView numOfSatTestTakers, @NonNull ConstraintLayout resultContainer,
      @NonNull TextView satCriticalReadingAvgScore, @NonNull TextView satMathAvgScore,
      @NonNull TextView satWritingAvgScore, @NonNull TextView schoolNamesTV) {
    this.rootView = rootView;
    this.dbnTV = dbnTV;
    this.loadSchoolData = loadSchoolData;
    this.noDataFoundTV = noDataFoundTV;
    this.numOfSatTestTakers = numOfSatTestTakers;
    this.resultContainer = resultContainer;
    this.satCriticalReadingAvgScore = satCriticalReadingAvgScore;
    this.satMathAvgScore = satMathAvgScore;
    this.satWritingAvgScore = satWritingAvgScore;
    this.schoolNamesTV = schoolNamesTV;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSchoolsDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSchoolsDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_schools_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSchoolsDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dbnTV;
      TextView dbnTV = ViewBindings.findChildViewById(rootView, id);
      if (dbnTV == null) {
        break missingId;
      }

      id = R.id.loadSchoolData;
      ProgressBar loadSchoolData = ViewBindings.findChildViewById(rootView, id);
      if (loadSchoolData == null) {
        break missingId;
      }

      id = R.id.noDataFoundTV;
      TextView noDataFoundTV = ViewBindings.findChildViewById(rootView, id);
      if (noDataFoundTV == null) {
        break missingId;
      }

      id = R.id.num_of_sat_test_takers;
      TextView numOfSatTestTakers = ViewBindings.findChildViewById(rootView, id);
      if (numOfSatTestTakers == null) {
        break missingId;
      }

      id = R.id.resultContainer;
      ConstraintLayout resultContainer = ViewBindings.findChildViewById(rootView, id);
      if (resultContainer == null) {
        break missingId;
      }

      id = R.id.sat_critical_reading_avg_score;
      TextView satCriticalReadingAvgScore = ViewBindings.findChildViewById(rootView, id);
      if (satCriticalReadingAvgScore == null) {
        break missingId;
      }

      id = R.id.sat_math_avg_score;
      TextView satMathAvgScore = ViewBindings.findChildViewById(rootView, id);
      if (satMathAvgScore == null) {
        break missingId;
      }

      id = R.id.sat_writing_avg_score;
      TextView satWritingAvgScore = ViewBindings.findChildViewById(rootView, id);
      if (satWritingAvgScore == null) {
        break missingId;
      }

      id = R.id.schoolNamesTV;
      TextView schoolNamesTV = ViewBindings.findChildViewById(rootView, id);
      if (schoolNamesTV == null) {
        break missingId;
      }

      return new FragmentSchoolsDetailBinding((ConstraintLayout) rootView, dbnTV, loadSchoolData,
          noDataFoundTV, numOfSatTestTakers, resultContainer, satCriticalReadingAvgScore,
          satMathAvgScore, satWritingAvgScore, schoolNamesTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}