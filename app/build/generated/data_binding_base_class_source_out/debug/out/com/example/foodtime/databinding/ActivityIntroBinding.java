// Generated by view binder compiler. Do not edit!
package com.example.foodtime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodtime.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIntroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ConstraintLayout startBtn;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private ActivityIntroBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView6,
      @NonNull ImageView imageView7, @NonNull ConstraintLayout startBtn, @NonNull TextView textView,
      @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.startBtn = startBtn;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIntroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIntroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_intro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIntroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.startBtn;
      ConstraintLayout startBtn = ViewBindings.findChildViewById(rootView, id);
      if (startBtn == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityIntroBinding((ConstraintLayout) rootView, imageView6, imageView7, startBtn,
          textView, textView2, textView3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
