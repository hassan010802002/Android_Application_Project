// Generated by view binder compiler. Do not edit!
package com.example.foodtime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodtime.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout CardBtnAgain;

  @NonNull
  public final LinearLayout ProfileBtnCard;

  @NonNull
  public final BottomAppBar appBar;

  @NonNull
  public final TextView card;

  @NonNull
  public final ImageView cardPage;

  @NonNull
  public final TextView deliveryServicePrice;

  @NonNull
  public final TextView deliveryServiceView;

  @NonNull
  public final TextView emptyView;

  @NonNull
  public final RecyclerView foodListView;

  @NonNull
  public final TextView home;

  @NonNull
  public final LinearLayout homeBtnCard;

  @NonNull
  public final ImageView homePage;

  @NonNull
  public final CoordinatorLayout itemtotal;

  @NonNull
  public final TextView profile;

  @NonNull
  public final ImageView profilePage;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView settings;

  @NonNull
  public final ImageView settingsPage;

  @NonNull
  public final TextView support;

  @NonNull
  public final ImageView supportPage;

  @NonNull
  public final TextView taxPrice;

  @NonNull
  public final TextView taxView;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView totalItemCount;

  @NonNull
  public final TextView totalItemView;

  @NonNull
  public final TextView totalPrice;

  @NonNull
  public final TextView totalView;

  @NonNull
  public final View view3;

  private ActivityCartBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout CardBtnAgain, @NonNull LinearLayout ProfileBtnCard,
      @NonNull BottomAppBar appBar, @NonNull TextView card, @NonNull ImageView cardPage,
      @NonNull TextView deliveryServicePrice, @NonNull TextView deliveryServiceView,
      @NonNull TextView emptyView, @NonNull RecyclerView foodListView, @NonNull TextView home,
      @NonNull LinearLayout homeBtnCard, @NonNull ImageView homePage,
      @NonNull CoordinatorLayout itemtotal, @NonNull TextView profile,
      @NonNull ImageView profilePage, @NonNull ScrollView scrollView2, @NonNull TextView settings,
      @NonNull ImageView settingsPage, @NonNull TextView support, @NonNull ImageView supportPage,
      @NonNull TextView taxPrice, @NonNull TextView taxView, @NonNull TextView textView13,
      @NonNull TextView textView15, @NonNull TextView totalItemCount,
      @NonNull TextView totalItemView, @NonNull TextView totalPrice, @NonNull TextView totalView,
      @NonNull View view3) {
    this.rootView = rootView;
    this.CardBtnAgain = CardBtnAgain;
    this.ProfileBtnCard = ProfileBtnCard;
    this.appBar = appBar;
    this.card = card;
    this.cardPage = cardPage;
    this.deliveryServicePrice = deliveryServicePrice;
    this.deliveryServiceView = deliveryServiceView;
    this.emptyView = emptyView;
    this.foodListView = foodListView;
    this.home = home;
    this.homeBtnCard = homeBtnCard;
    this.homePage = homePage;
    this.itemtotal = itemtotal;
    this.profile = profile;
    this.profilePage = profilePage;
    this.scrollView2 = scrollView2;
    this.settings = settings;
    this.settingsPage = settingsPage;
    this.support = support;
    this.supportPage = supportPage;
    this.taxPrice = taxPrice;
    this.taxView = taxView;
    this.textView13 = textView13;
    this.textView15 = textView15;
    this.totalItemCount = totalItemCount;
    this.totalItemView = totalItemView;
    this.totalPrice = totalPrice;
    this.totalView = totalView;
    this.view3 = view3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CardBtn_again;
      LinearLayout CardBtnAgain = ViewBindings.findChildViewById(rootView, id);
      if (CardBtnAgain == null) {
        break missingId;
      }

      id = R.id.ProfileBtn_Card;
      LinearLayout ProfileBtnCard = ViewBindings.findChildViewById(rootView, id);
      if (ProfileBtnCard == null) {
        break missingId;
      }

      id = R.id.app_bar;
      BottomAppBar appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.card;
      TextView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.cardPage;
      ImageView cardPage = ViewBindings.findChildViewById(rootView, id);
      if (cardPage == null) {
        break missingId;
      }

      id = R.id.delivery_Service_Price;
      TextView deliveryServicePrice = ViewBindings.findChildViewById(rootView, id);
      if (deliveryServicePrice == null) {
        break missingId;
      }

      id = R.id.delivery_Service_View;
      TextView deliveryServiceView = ViewBindings.findChildViewById(rootView, id);
      if (deliveryServiceView == null) {
        break missingId;
      }

      id = R.id.empty_View;
      TextView emptyView = ViewBindings.findChildViewById(rootView, id);
      if (emptyView == null) {
        break missingId;
      }

      id = R.id.food_list_view;
      RecyclerView foodListView = ViewBindings.findChildViewById(rootView, id);
      if (foodListView == null) {
        break missingId;
      }

      id = R.id.home;
      TextView home = ViewBindings.findChildViewById(rootView, id);
      if (home == null) {
        break missingId;
      }

      id = R.id.homeBtn_Card;
      LinearLayout homeBtnCard = ViewBindings.findChildViewById(rootView, id);
      if (homeBtnCard == null) {
        break missingId;
      }

      id = R.id.homePage;
      ImageView homePage = ViewBindings.findChildViewById(rootView, id);
      if (homePage == null) {
        break missingId;
      }

      id = R.id.itemtotal;
      CoordinatorLayout itemtotal = ViewBindings.findChildViewById(rootView, id);
      if (itemtotal == null) {
        break missingId;
      }

      id = R.id.profile;
      TextView profile = ViewBindings.findChildViewById(rootView, id);
      if (profile == null) {
        break missingId;
      }

      id = R.id.profilePage;
      ImageView profilePage = ViewBindings.findChildViewById(rootView, id);
      if (profilePage == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.settings;
      TextView settings = ViewBindings.findChildViewById(rootView, id);
      if (settings == null) {
        break missingId;
      }

      id = R.id.settingsPage;
      ImageView settingsPage = ViewBindings.findChildViewById(rootView, id);
      if (settingsPage == null) {
        break missingId;
      }

      id = R.id.support;
      TextView support = ViewBindings.findChildViewById(rootView, id);
      if (support == null) {
        break missingId;
      }

      id = R.id.supportPage;
      ImageView supportPage = ViewBindings.findChildViewById(rootView, id);
      if (supportPage == null) {
        break missingId;
      }

      id = R.id.tax_Price;
      TextView taxPrice = ViewBindings.findChildViewById(rootView, id);
      if (taxPrice == null) {
        break missingId;
      }

      id = R.id.tax_View;
      TextView taxView = ViewBindings.findChildViewById(rootView, id);
      if (taxView == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.total_Item_Count;
      TextView totalItemCount = ViewBindings.findChildViewById(rootView, id);
      if (totalItemCount == null) {
        break missingId;
      }

      id = R.id.total_Item_View;
      TextView totalItemView = ViewBindings.findChildViewById(rootView, id);
      if (totalItemView == null) {
        break missingId;
      }

      id = R.id.total_Price;
      TextView totalPrice = ViewBindings.findChildViewById(rootView, id);
      if (totalPrice == null) {
        break missingId;
      }

      id = R.id.total_View;
      TextView totalView = ViewBindings.findChildViewById(rootView, id);
      if (totalView == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = ViewBindings.findChildViewById(rootView, id);
      if (view3 == null) {
        break missingId;
      }

      return new ActivityCartBinding((ConstraintLayout) rootView, CardBtnAgain, ProfileBtnCard,
          appBar, card, cardPage, deliveryServicePrice, deliveryServiceView, emptyView,
          foodListView, home, homeBtnCard, homePage, itemtotal, profile, profilePage, scrollView2,
          settings, settingsPage, support, supportPage, taxPrice, taxView, textView13, textView15,
          totalItemCount, totalItemView, totalPrice, totalView, view3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
