// Generated by view binder compiler. Do not edit!
package com.example.foodtime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodtime.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShowDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout CardBtnAgain;

  @NonNull
  public final LinearLayout GoogleMap;

  @NonNull
  public final LinearLayout ProfileBtnCard;

  @NonNull
  public final TextView addToCartBtn;

  @NonNull
  public final BottomAppBar appBar;

  @NonNull
  public final ImageView caloriesImage;

  @NonNull
  public final TextView caloriesTxt;

  @NonNull
  public final TextView card;

  @NonNull
  public final ImageView cardPage;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final TextView describtionTxt;

  @NonNull
  public final ImageView foodPic;

  @NonNull
  public final TextView foodTitle;

  @NonNull
  public final TextView home;

  @NonNull
  public final LinearLayout homeBtnCard;

  @NonNull
  public final ImageView homePage;

  @NonNull
  public final LinearLayout homebtnSetting;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final CoordinatorLayout itemtotal;

  @NonNull
  public final ImageView minusCardBtn;

  @NonNull
  public final TextView numberItemTxt;

  @NonNull
  public final ImageView plusCardBtn;

  @NonNull
  public final TextView priceTxt;

  @NonNull
  public final TextView profile;

  @NonNull
  public final ImageView profilePage;

  @NonNull
  public final TextView settings;

  @NonNull
  public final ImageView settingsPage;

  @NonNull
  public final ImageView starImage;

  @NonNull
  public final TextView starTxt;

  @NonNull
  public final TextView support;

  @NonNull
  public final ImageView supportPage;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final ImageView timeImage;

  @NonNull
  public final TextView timeTxt;

  @NonNull
  public final TextView totalPriceTxt;

  private ActivityShowDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout CardBtnAgain, @NonNull LinearLayout GoogleMap,
      @NonNull LinearLayout ProfileBtnCard, @NonNull TextView addToCartBtn,
      @NonNull BottomAppBar appBar, @NonNull ImageView caloriesImage, @NonNull TextView caloriesTxt,
      @NonNull TextView card, @NonNull ImageView cardPage,
      @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3,
      @NonNull TextView describtionTxt, @NonNull ImageView foodPic, @NonNull TextView foodTitle,
      @NonNull TextView home, @NonNull LinearLayout homeBtnCard, @NonNull ImageView homePage,
      @NonNull LinearLayout homebtnSetting, @NonNull ImageView imageView5,
      @NonNull CoordinatorLayout itemtotal, @NonNull ImageView minusCardBtn,
      @NonNull TextView numberItemTxt, @NonNull ImageView plusCardBtn, @NonNull TextView priceTxt,
      @NonNull TextView profile, @NonNull ImageView profilePage, @NonNull TextView settings,
      @NonNull ImageView settingsPage, @NonNull ImageView starImage, @NonNull TextView starTxt,
      @NonNull TextView support, @NonNull ImageView supportPage, @NonNull TextView textView19,
      @NonNull ImageView timeImage, @NonNull TextView timeTxt, @NonNull TextView totalPriceTxt) {
    this.rootView = rootView;
    this.CardBtnAgain = CardBtnAgain;
    this.GoogleMap = GoogleMap;
    this.ProfileBtnCard = ProfileBtnCard;
    this.addToCartBtn = addToCartBtn;
    this.appBar = appBar;
    this.caloriesImage = caloriesImage;
    this.caloriesTxt = caloriesTxt;
    this.card = card;
    this.cardPage = cardPage;
    this.constraintLayout2 = constraintLayout2;
    this.constraintLayout3 = constraintLayout3;
    this.describtionTxt = describtionTxt;
    this.foodPic = foodPic;
    this.foodTitle = foodTitle;
    this.home = home;
    this.homeBtnCard = homeBtnCard;
    this.homePage = homePage;
    this.homebtnSetting = homebtnSetting;
    this.imageView5 = imageView5;
    this.itemtotal = itemtotal;
    this.minusCardBtn = minusCardBtn;
    this.numberItemTxt = numberItemTxt;
    this.plusCardBtn = plusCardBtn;
    this.priceTxt = priceTxt;
    this.profile = profile;
    this.profilePage = profilePage;
    this.settings = settings;
    this.settingsPage = settingsPage;
    this.starImage = starImage;
    this.starTxt = starTxt;
    this.support = support;
    this.supportPage = supportPage;
    this.textView19 = textView19;
    this.timeImage = timeImage;
    this.timeTxt = timeTxt;
    this.totalPriceTxt = totalPriceTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShowDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShowDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_show_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShowDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CardBtn_again;
      LinearLayout CardBtnAgain = ViewBindings.findChildViewById(rootView, id);
      if (CardBtnAgain == null) {
        break missingId;
      }

      id = R.id.Google_Map;
      LinearLayout GoogleMap = ViewBindings.findChildViewById(rootView, id);
      if (GoogleMap == null) {
        break missingId;
      }

      id = R.id.ProfileBtn_Card;
      LinearLayout ProfileBtnCard = ViewBindings.findChildViewById(rootView, id);
      if (ProfileBtnCard == null) {
        break missingId;
      }

      id = R.id.add_to_Cart_Btn;
      TextView addToCartBtn = ViewBindings.findChildViewById(rootView, id);
      if (addToCartBtn == null) {
        break missingId;
      }

      id = R.id.app_bar;
      BottomAppBar appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.caloriesImage;
      ImageView caloriesImage = ViewBindings.findChildViewById(rootView, id);
      if (caloriesImage == null) {
        break missingId;
      }

      id = R.id.caloriesTxt;
      TextView caloriesTxt = ViewBindings.findChildViewById(rootView, id);
      if (caloriesTxt == null) {
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

      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.describtionTxt;
      TextView describtionTxt = ViewBindings.findChildViewById(rootView, id);
      if (describtionTxt == null) {
        break missingId;
      }

      id = R.id.foodPic;
      ImageView foodPic = ViewBindings.findChildViewById(rootView, id);
      if (foodPic == null) {
        break missingId;
      }

      id = R.id.food_Title;
      TextView foodTitle = ViewBindings.findChildViewById(rootView, id);
      if (foodTitle == null) {
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

      id = R.id.homebtn_setting;
      LinearLayout homebtnSetting = ViewBindings.findChildViewById(rootView, id);
      if (homebtnSetting == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.itemtotal;
      CoordinatorLayout itemtotal = ViewBindings.findChildViewById(rootView, id);
      if (itemtotal == null) {
        break missingId;
      }

      id = R.id.minus_Card_Btn;
      ImageView minusCardBtn = ViewBindings.findChildViewById(rootView, id);
      if (minusCardBtn == null) {
        break missingId;
      }

      id = R.id.numberItemTxt;
      TextView numberItemTxt = ViewBindings.findChildViewById(rootView, id);
      if (numberItemTxt == null) {
        break missingId;
      }

      id = R.id.plus_Card_Btn;
      ImageView plusCardBtn = ViewBindings.findChildViewById(rootView, id);
      if (plusCardBtn == null) {
        break missingId;
      }

      id = R.id.priceTxt;
      TextView priceTxt = ViewBindings.findChildViewById(rootView, id);
      if (priceTxt == null) {
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

      id = R.id.starImage;
      ImageView starImage = ViewBindings.findChildViewById(rootView, id);
      if (starImage == null) {
        break missingId;
      }

      id = R.id.starTxt;
      TextView starTxt = ViewBindings.findChildViewById(rootView, id);
      if (starTxt == null) {
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

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.timeImage;
      ImageView timeImage = ViewBindings.findChildViewById(rootView, id);
      if (timeImage == null) {
        break missingId;
      }

      id = R.id.timeTxt;
      TextView timeTxt = ViewBindings.findChildViewById(rootView, id);
      if (timeTxt == null) {
        break missingId;
      }

      id = R.id.total_Price_Txt;
      TextView totalPriceTxt = ViewBindings.findChildViewById(rootView, id);
      if (totalPriceTxt == null) {
        break missingId;
      }

      return new ActivityShowDetailBinding((ConstraintLayout) rootView, CardBtnAgain, GoogleMap,
          ProfileBtnCard, addToCartBtn, appBar, caloriesImage, caloriesTxt, card, cardPage,
          constraintLayout2, constraintLayout3, describtionTxt, foodPic, foodTitle, home,
          homeBtnCard, homePage, homebtnSetting, imageView5, itemtotal, minusCardBtn, numberItemTxt,
          plusCardBtn, priceTxt, profile, profilePage, settings, settingsPage, starImage, starTxt,
          support, supportPage, textView19, timeImage, timeTxt, totalPriceTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
