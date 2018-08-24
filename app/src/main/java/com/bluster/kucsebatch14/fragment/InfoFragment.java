package com.bluster.kucsebatch14.fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.bluster.kucsebatch14.activity.ArcLayoutMainActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bluster.kucsebatch14.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.content.Context.MODE_PRIVATE;


/**
 * Created by kucsebatch14 on 2018.07.6.
 */
public class InfoFragment extends Fragment implements View.OnClickListener, View.OnTouchListener {

    private ImageView img_main_card2_share, img_main_card2_bookmark, img_main_card2_favorite;
    private boolean  isBookmark41Clicked, isBookmark42Clicked, isFavorite41Clicked, isFavorite42Clicked;


    private ImageView  img_main_card_41, img_main_card_42, student_img_main_card_1,student_img_main_card_2,student_img_main_card_3,student_img_main_card_4,student_img_main_card_5,student_img_main_card_6,student_img_main_card_7,student_img_main_card_8,student_img_main_card_10,student_img_main_card_11,student_img_main_card_12,student_img_main_card_13,student_img_main_card_14,student_img_main_card_15,student_img_main_card_16,student_img_main_card_17,student_img_main_card_18,student_img_main_card_19,student_img_main_card_20,student_img_main_card_21,student_img_main_card_22,student_img_main_card_23,student_img_main_card_24,student_img_main_card_25,student_img_main_card_27,student_img_main_card_28,student_img_main_card_29,student_img_main_card_30,student_img_main_card_31,student_img_main_card_32,student_img_main_card_33,student_img_main_card_34,student_img_main_card_35,student_img_main_card_36,student_img_main_card_37,student_img_main_card_38,student_img_main_card_39,student_img_main_card_40,student_img_main_card_41;

    private CardView  card_main_1_4_1, card_main_1_4_2, student_card_main_1,student_card_main_2,student_card_main_3,student_card_main_4,student_card_main_5,student_card_main_6,student_card_main_7,student_card_main_8,student_card_main_9,student_card_main_10,student_card_main_11,student_card_main_12,student_card_main_13,student_card_main_14,student_card_main_15,student_card_main_16,student_card_main_17,student_card_main_18,student_card_main_19,student_card_main_20,student_card_main_21,student_card_main_22,student_card_main_23,student_card_main_24,student_card_main_25,student_card_main_27,student_card_main_28,student_card_main_29,student_card_main_30,student_card_main_31,student_card_main_32,student_card_main_33,student_card_main_34,student_card_main_35,student_card_main_36,student_card_main_37,student_card_main_38,student_card_main_39,student_card_main_40,student_card_main_41;

    private AlphaAnimation alphaAnimation, alphaAnimationShowIcon;

    private CardView card_ad_dialog;
    private AdView ad_view_dialog;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_info, container, false);

        //Adding the image view
        //----------------------

        img_main_card_41 = nestedScrollView.findViewById(R.id.img_main_card_41);
        img_main_card_42 = nestedScrollView.findViewById(R.id.img_main_card_42);

        student_img_main_card_1 = nestedScrollView.findViewById(R.id.student_img_main_card_1);
        student_img_main_card_2 = nestedScrollView.findViewById(R.id.student_img_main_card_2);
        student_img_main_card_3 = nestedScrollView.findViewById(R.id.student_img_main_card_3);
        student_img_main_card_4 = nestedScrollView.findViewById(R.id.student_img_main_card_4);
        student_img_main_card_5 = nestedScrollView.findViewById(R.id.student_img_main_card_5);
        student_img_main_card_6 = nestedScrollView.findViewById(R.id.student_img_main_card_6);
        student_img_main_card_7 = nestedScrollView.findViewById(R.id.student_img_main_card_7);
        student_img_main_card_8 = nestedScrollView.findViewById(R.id.student_img_main_card_8);

        student_img_main_card_10 = nestedScrollView.findViewById(R.id.student_img_main_card_10);
        student_img_main_card_11 = nestedScrollView.findViewById(R.id.student_img_main_card_11);
        student_img_main_card_12 = nestedScrollView.findViewById(R.id.student_img_main_card_12);
        student_img_main_card_14 = nestedScrollView.findViewById(R.id.student_img_main_card_14);
        student_img_main_card_15 = nestedScrollView.findViewById(R.id.student_img_main_card_15);
        student_img_main_card_16 = nestedScrollView.findViewById(R.id.student_img_main_card_16);
        student_img_main_card_17 = nestedScrollView.findViewById(R.id.student_img_main_card_17);
        student_img_main_card_18 = nestedScrollView.findViewById(R.id.student_img_main_card_18);
        student_img_main_card_19 = nestedScrollView.findViewById(R.id.student_img_main_card_19);
        student_img_main_card_20 = nestedScrollView.findViewById(R.id.student_img_main_card_20);
        student_img_main_card_21 = nestedScrollView.findViewById(R.id.student_img_main_card_21);
        student_img_main_card_22 = nestedScrollView.findViewById(R.id.student_img_main_card_22);
        student_img_main_card_23 = nestedScrollView.findViewById(R.id.student_img_main_card_23);
        student_img_main_card_24 = nestedScrollView.findViewById(R.id.student_img_main_card_24);
        student_img_main_card_25 = nestedScrollView.findViewById(R.id.student_img_main_card_25);
        student_img_main_card_27 = nestedScrollView.findViewById(R.id.student_img_main_card_27);
        student_img_main_card_28 = nestedScrollView.findViewById(R.id.student_img_main_card_28);
        student_img_main_card_29 = nestedScrollView.findViewById(R.id.student_img_main_card_29);
        student_img_main_card_30 = nestedScrollView.findViewById(R.id.student_img_main_card_30);
        student_img_main_card_31 = nestedScrollView.findViewById(R.id.student_img_main_card_31);
        student_img_main_card_32 = nestedScrollView.findViewById(R.id.student_img_main_card_32);
        student_img_main_card_33 = nestedScrollView.findViewById(R.id.student_img_main_card_33);
        student_img_main_card_34 = nestedScrollView.findViewById(R.id.student_img_main_card_34);
        student_img_main_card_35 = nestedScrollView.findViewById(R.id.student_img_main_card_35);
        student_img_main_card_36 = nestedScrollView.findViewById(R.id.student_img_main_card_36);
        student_img_main_card_37 = nestedScrollView.findViewById(R.id.student_img_main_card_37);
        student_img_main_card_38 = nestedScrollView.findViewById(R.id.student_img_main_card_38);
        student_img_main_card_39 = nestedScrollView.findViewById(R.id.student_img_main_card_39);
        student_img_main_card_40 = nestedScrollView.findViewById(R.id.student_img_main_card_40);
        student_img_main_card_41 = nestedScrollView.findViewById(R.id.student_img_main_card_41);



//        img_main_card41_favorite = nestedScrollView.findViewById(R.id.img_main_card41_favorite);
//        img_main_card42_favorite = nestedScrollView.findViewById(R.id.img_main_card42_favorite);
//        img_main_card41_bookmark = nestedScrollView.findViewById(R.id.img_main_card41_bookmark);
//        img_main_card42_bookmark = nestedScrollView.findViewById(R.id.img_main_card42_bookmark);
//        img_main_card41_share = nestedScrollView.findViewById(R.id.img_main_card41_share);
//        img_main_card42_share = nestedScrollView.findViewById(R.id.img_main_card42_share);

        card_main_1_4_1 = nestedScrollView.findViewById(R.id.card_main_1_4_1);
        card_main_1_4_2 = nestedScrollView.findViewById(R.id.card_main_1_4_2);


        //Adding the card view
        //--------------------
        student_card_main_1 = nestedScrollView.findViewById(R.id.student_card_main_1);
        student_card_main_2 = nestedScrollView.findViewById(R.id.student_card_main_2);
        student_card_main_3 = nestedScrollView.findViewById(R.id.student_card_main_3);
        student_card_main_4 = nestedScrollView.findViewById(R.id.student_card_main_4);
        student_card_main_5 = nestedScrollView.findViewById(R.id.student_card_main_5);
        student_card_main_6 = nestedScrollView.findViewById(R.id.student_card_main_6);
        student_card_main_7 = nestedScrollView.findViewById(R.id.student_card_main_7);
        student_card_main_8 = nestedScrollView.findViewById(R.id.student_card_main_8);

        student_card_main_10 = nestedScrollView.findViewById(R.id.student_card_main_10);
        student_card_main_11 = nestedScrollView.findViewById(R.id.student_card_main_11);
        student_card_main_12 = nestedScrollView.findViewById(R.id.student_card_main_12);

        student_card_main_14 = nestedScrollView.findViewById(R.id.student_card_main_14);
        student_card_main_15 = nestedScrollView.findViewById(R.id.student_card_main_15);
        student_card_main_16 = nestedScrollView.findViewById(R.id.student_card_main_16);
        student_card_main_17 = nestedScrollView.findViewById(R.id.student_card_main_17);
        student_card_main_18 = nestedScrollView.findViewById(R.id.student_card_main_18);
        student_card_main_19 = nestedScrollView.findViewById(R.id.student_card_main_19);
        student_card_main_20 = nestedScrollView.findViewById(R.id.student_card_main_20);
        student_card_main_21 = nestedScrollView.findViewById(R.id.student_card_main_21);
        student_card_main_22 = nestedScrollView.findViewById(R.id.student_card_main_22);
        student_card_main_23 = nestedScrollView.findViewById(R.id.student_card_main_23);
        student_card_main_24 = nestedScrollView.findViewById(R.id.student_card_main_24);
        student_card_main_25 = nestedScrollView.findViewById(R.id.student_card_main_25);
        student_card_main_27 = nestedScrollView.findViewById(R.id.student_card_main_27);
        student_card_main_28 = nestedScrollView.findViewById(R.id.student_card_main_28);
        student_card_main_29 = nestedScrollView.findViewById(R.id.student_card_main_29);
        student_card_main_30 = nestedScrollView.findViewById(R.id.student_card_main_30);
        student_card_main_31 = nestedScrollView.findViewById(R.id.student_card_main_31);
        student_card_main_32 = nestedScrollView.findViewById(R.id.student_card_main_32);
        student_card_main_33 = nestedScrollView.findViewById(R.id.student_card_main_33);
        student_card_main_34 = nestedScrollView.findViewById(R.id.student_card_main_34);
        student_card_main_35 = nestedScrollView.findViewById(R.id.student_card_main_35);
        student_card_main_36 = nestedScrollView.findViewById(R.id.student_card_main_36);
        student_card_main_37 = nestedScrollView.findViewById(R.id.student_card_main_37);
        student_card_main_38 = nestedScrollView.findViewById(R.id.student_card_main_38);
        student_card_main_39 = nestedScrollView.findViewById(R.id.student_card_main_39);
        student_card_main_40 = nestedScrollView.findViewById(R.id.student_card_main_40);
        student_card_main_41 = nestedScrollView.findViewById(R.id.student_card_main_41);




//        Glide.with(getContext()).load(R.drawable.d).apply(new RequestOptions().fitCenter()).into(img_main_card_41);
//        Glide.with(getContext()).load(R.drawable.e).apply(new RequestOptions().fitCenter()).into(img_main_card_42);


     //adding the image with glide
        Glide.with(getContext()).load(R.drawable.rumpa).apply(new RequestOptions().fitCenter()).into(student_img_main_card_1);
        Glide.with(getContext()).load(R.drawable.tohid).apply(new RequestOptions().fitCenter()).into(student_img_main_card_2);
        Glide.with(getContext()).load(R.drawable.f1).apply(new RequestOptions().fitCenter()).into(student_img_main_card_3);
        Glide.with(getContext()).load(R.drawable.c1).apply(new RequestOptions().fitCenter()).into(student_img_main_card_4);
        Glide.with(getContext()).load(R.drawable.x).apply(new RequestOptions().fitCenter()).into(student_img_main_card_5);
        Glide.with(getContext()).load(R.drawable.v).apply(new RequestOptions().fitCenter()).into(student_img_main_card_6);
        Glide.with(getContext()).load(R.drawable.k).apply(new RequestOptions().fitCenter()).into(student_img_main_card_7);
        Glide.with(getContext()).load(R.drawable.d1).apply(new RequestOptions().fitCenter()).into(student_img_main_card_8);
        Glide.with(getContext()).load(R.drawable.n).apply(new RequestOptions().fitCenter()).into(student_img_main_card_10);
        Glide.with(getContext()).load(R.drawable.h1).apply(new RequestOptions().fitCenter()).into(student_img_main_card_11);
        Glide.with(getContext()).load(R.drawable.pic_c).apply(new RequestOptions().fitCenter()).into(student_img_main_card_12);
        Glide.with(getContext()).load(R.drawable.g).apply(new RequestOptions().fitCenter()).into(student_img_main_card_14);
        Glide.with(getContext()).load(R.drawable.z).apply(new RequestOptions().fitCenter()).into(student_img_main_card_15);
        Glide.with(getContext()).load(R.drawable.q).apply(new RequestOptions().fitCenter()).into(student_img_main_card_16);
        Glide.with(getContext()).load(R.drawable.fahim).apply(new RequestOptions().fitCenter()).into(student_img_main_card_17);
        Glide.with(getContext()).load(R.drawable.j).apply(new RequestOptions().fitCenter()).into(student_img_main_card_18);
        Glide.with(getContext()).load(R.drawable.i).apply(new RequestOptions().fitCenter()).into(student_img_main_card_19);
        Glide.with(getContext()).load(R.drawable.t).apply(new RequestOptions().fitCenter()).into(student_img_main_card_20);
        Glide.with(getContext()).load(R.drawable.picss_samima).apply(new RequestOptions().fitCenter()).into(student_img_main_card_21);
        Glide.with(getContext()).load(R.drawable.sumit).apply(new RequestOptions().fitCenter()).into(student_img_main_card_22);
        Glide.with(getContext()).load(R.drawable.o).apply(new RequestOptions().fitCenter()).into(student_img_main_card_23);
        Glide.with(getContext()).load(R.drawable.a1).apply(new RequestOptions().fitCenter()).into(student_img_main_card_24);
        Glide.with(getContext()).load(R.drawable.l).apply(new RequestOptions().fitCenter()).into(student_img_main_card_25);
        Glide.with(getContext()).load(R.drawable.e).apply(new RequestOptions().fitCenter()).into(student_img_main_card_27);
        Glide.with(getContext()).load(R.drawable.u).apply(new RequestOptions().fitCenter()).into(student_img_main_card_28);
        Glide.with(getContext()).load(R.drawable.f).apply(new RequestOptions().fitCenter()).into(student_img_main_card_29);
        Glide.with(getContext()).load(R.drawable.s).apply(new RequestOptions().fitCenter()).into(student_img_main_card_30);
        Glide.with(getContext()).load(R.drawable.h).apply(new RequestOptions().fitCenter()).into(student_img_main_card_31);
        Glide.with(getContext()).load(R.drawable.b1).apply(new RequestOptions().fitCenter()).into(student_img_main_card_32);
        Glide.with(getContext()).load(R.drawable.y).apply(new RequestOptions().fitCenter()).into(student_img_main_card_33);
        Glide.with(getContext()).load(R.drawable.sujon).apply(new RequestOptions().fitCenter()).into(student_img_main_card_34);
        Glide.with(getContext()).load(R.drawable.e1).apply(new RequestOptions().fitCenter()).into(student_img_main_card_35);
        Glide.with(getContext()).load(R.drawable.pic_b).apply(new RequestOptions().fitCenter()).into(student_img_main_card_36);
        Glide.with(getContext()).load(R.drawable.pic_mus).apply(new RequestOptions().fitCenter()).into(student_img_main_card_37);
        Glide.with(getContext()).load(R.drawable.pic_a).apply(new RequestOptions().fitCenter()).into(student_img_main_card_38);
        Glide.with(getContext()).load(R.drawable.m).apply(new RequestOptions().fitCenter()).into(student_img_main_card_39);
        Glide.with(getContext()).load(R.drawable.d).apply(new RequestOptions().fitCenter()).into(student_img_main_card_40);
        Glide.with(getContext()).load(R.drawable.w).apply(new RequestOptions().fitCenter()).into(student_img_main_card_41);



        ad_view_dialog = nestedScrollView.findViewById(R.id.ad_view_card);
        card_ad_dialog = nestedScrollView.findViewById(R.id.card_ad_card);

        return nestedScrollView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//
//        img_main_card41_favorite.setOnClickListener(this);
//        img_main_card42_favorite.setOnClickListener(this);
//        img_main_card41_bookmark.setOnClickListener(this);
//        img_main_card42_bookmark.setOnClickListener(this);
//        img_main_card41_share.setOnClickListener(this);
//        img_main_card42_share.setOnClickListener(this);



//        card_main_1_4_1.setOnClickListener(this);
//        card_main_1_4_2.setOnClickListener(this);


//        card_main_1_4_1.setOnTouchListener(this);
//        card_main_1_4_2.setOnTouchListener(this);

        student_card_main_1.setOnClickListener(this);
        student_card_main_2.setOnClickListener(this);
        student_card_main_3.setOnClickListener(this);
        student_card_main_4.setOnClickListener(this);
        student_card_main_5.setOnClickListener(this);
        student_card_main_6.setOnClickListener(this);
        student_card_main_7.setOnClickListener(this);
        student_card_main_8.setOnClickListener(this);

        student_card_main_10.setOnClickListener(this);
        student_card_main_11.setOnClickListener(this);
        student_card_main_12.setOnClickListener(this);

        student_card_main_14.setOnClickListener(this);
        student_card_main_15.setOnClickListener(this);
        student_card_main_16.setOnClickListener(this);
        student_card_main_17.setOnClickListener(this);
        student_card_main_18.setOnClickListener(this);
        student_card_main_19.setOnClickListener(this);
        student_card_main_20.setOnClickListener(this);
        student_card_main_21.setOnClickListener(this);
        student_card_main_22.setOnClickListener(this);

        student_card_main_23.setOnClickListener(this);
        student_card_main_24.setOnClickListener(this);
        student_card_main_25.setOnClickListener(this);
        student_card_main_27.setOnClickListener(this);
        student_card_main_28.setOnClickListener(this);
        student_card_main_29.setOnClickListener(this);
        student_card_main_30.setOnClickListener(this);
        student_card_main_31.setOnClickListener(this);

        student_card_main_32.setOnClickListener(this);
        student_card_main_33.setOnClickListener(this);
        student_card_main_34.setOnClickListener(this);

        student_card_main_35.setOnClickListener(this);
        student_card_main_36.setOnClickListener(this);
        student_card_main_37.setOnClickListener(this);
        student_card_main_38.setOnClickListener(this);
        student_card_main_39.setOnClickListener(this);
        student_card_main_40.setOnClickListener(this);
        student_card_main_41.setOnClickListener(this);



        student_card_main_1.setOnTouchListener(this);
        student_card_main_1.setOnTouchListener(this);
        student_card_main_2.setOnTouchListener(this);
        student_card_main_3.setOnTouchListener(this);
        student_card_main_4.setOnTouchListener(this);
        student_card_main_5.setOnTouchListener(this);
        student_card_main_6.setOnTouchListener(this);
        student_card_main_7.setOnTouchListener(this);
        student_card_main_8.setOnTouchListener(this);

        student_card_main_10.setOnTouchListener(this);
        student_card_main_11.setOnTouchListener(this);
        student_card_main_12.setOnTouchListener(this);

        student_card_main_14.setOnTouchListener(this);
        student_card_main_15.setOnTouchListener(this);
        student_card_main_16.setOnTouchListener(this);
        student_card_main_17.setOnTouchListener(this);
        student_card_main_18.setOnTouchListener(this);
        student_card_main_19.setOnTouchListener(this);
        student_card_main_20.setOnTouchListener(this);
        student_card_main_21.setOnTouchListener(this);
        student_card_main_22.setOnTouchListener(this);

        student_card_main_23.setOnTouchListener(this);
        student_card_main_24.setOnTouchListener(this);
        student_card_main_25.setOnTouchListener(this);
        student_card_main_27.setOnTouchListener(this);
        student_card_main_28.setOnTouchListener(this);
        student_card_main_29.setOnTouchListener(this);
        student_card_main_30.setOnTouchListener(this);
        student_card_main_31.setOnTouchListener(this);

        student_card_main_32.setOnTouchListener(this);
        student_card_main_33.setOnTouchListener(this);
        student_card_main_34.setOnTouchListener(this);

        student_card_main_35.setOnTouchListener(this);
        student_card_main_36.setOnTouchListener(this);
        student_card_main_37.setOnTouchListener(this);
        student_card_main_38.setOnTouchListener(this);
        student_card_main_39.setOnTouchListener(this);
        student_card_main_40.setOnTouchListener(this);
        student_card_main_41.setOnTouchListener(this);



        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(700);


        alphaAnimationShowIcon = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimationShowIcon.setDuration(500);

        showAd();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {


//            case R.id.img_main_card41_favorite:
//                if (!isFavorite41Clicked) {
//                    img_main_card41_favorite.setImageResource(R.drawable.ic_favorite_black_24dp);
//                    img_main_card41_favorite.startAnimation(alphaAnimationShowIcon);
//                    isFavorite41Clicked = true;
//                } else {
//                    img_main_card41_favorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
//                    img_main_card41_favorite.startAnimation(alphaAnimationShowIcon);
//                    isFavorite41Clicked = false;
//                }
//                break;
//
//            case R.id.img_main_card42_favorite:
//                if (!isFavorite42Clicked) {
//                    img_main_card42_favorite.setImageResource(R.drawable.ic_favorite_black_24dp);
//                    img_main_card42_favorite.startAnimation(alphaAnimationShowIcon);
//                    isFavorite42Clicked = true;
//                } else {
//                    img_main_card42_favorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
//                    img_main_card42_favorite.startAnimation(alphaAnimationShowIcon);
//                    isFavorite42Clicked = false;
//                }
//                break;
//
//            case R.id.img_main_card41_bookmark:
//                if (!isBookmark41Clicked) {
//                    img_main_card41_bookmark.setImageResource(R.drawable.ic_bookmark_black_24dp);
//                    img_main_card41_bookmark.startAnimation(alphaAnimationShowIcon);
//                    isBookmark41Clicked = true;
//                } else {
//                    img_main_card41_bookmark.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
//                    img_main_card41_bookmark.startAnimation(alphaAnimationShowIcon);
//                    isBookmark41Clicked = false;
//                }
//                break;
//
//            case R.id.img_main_card42_bookmark:
//                if (!isBookmark42Clicked) {
//                    img_main_card42_bookmark.setImageResource(R.drawable.ic_bookmark_black_24dp);
//                    img_main_card42_bookmark.startAnimation(alphaAnimationShowIcon);
//                    isBookmark42Clicked = true;
//                } else {
//                    img_main_card42_bookmark.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
//                    img_main_card42_bookmark.startAnimation(alphaAnimationShowIcon);
//                    isBookmark42Clicked = false;
//                }
//                break;




//            case R.id.img_main_card41_share:
//                break;
//
//            case R.id.img_main_card42_share:
//                break;


//            case R.id.card_main_1_4_1:
//                break;
//
//            case R.id.card_main_1_4_2:
//                break;

            case R.id.student_card_main_1:


            break;


            case R.id.student_card_main_2:



            case R.id.student_card_main_3:


                break;


            case R.id.student_card_main_4:


                break;

            case R.id.student_card_main_5:


                break;

            case R.id.student_card_main_6:


                break;


            case R.id.student_card_main_7:


                break;

            case R.id.student_card_main_8:


                break;


            case R.id.student_card_main_10:


                break;

            case R.id.student_card_main_11:


                break;

            case R.id.student_card_main_12:


                break;


            case R.id.student_card_main_14:


                break;

            case R.id.student_card_main_15:


                break;


            case R.id.student_card_main_16:


                break;

            case R.id.student_card_main_17:


                break;

            case R.id.student_card_main_18:


                break;


            case R.id.student_card_main_19:


                break;

            case R.id.student_card_main_20:


                break;


            case R.id.student_card_main_21:


                break;


            case R.id.student_card_main_23:


                break;

            case R.id.student_card_main_24:


                break;



            case R.id.student_card_main_25:


                break;






            case R.id.student_card_main_27:


                break;



            case R.id.student_card_main_28:


                break;


            case R.id.student_card_main_29:


                break;


            case R.id.student_card_main_30:


                break;


            case R.id.student_card_main_31:


                break;



            case R.id.student_card_main_32:


                break;


            case R.id.student_card_main_33:


                break;



            case R.id.student_card_main_34:


                break;


            case R.id.student_card_main_35:


                break;



            case R.id.student_card_main_36:


                break;


            case R.id.student_card_main_37:


                break;


            case R.id.student_card_main_38:


                break;

            case R.id.student_card_main_39:
                intent.setClass(getActivity(), ArcLayoutMainActivity.class);
                startActivity(intent);

                break;

            case R.id.student_card_main_40:


                break;

            case R.id.student_card_main_41:


                break;









        }
    }






    @Override
    public boolean onTouch(View v, MotionEvent event) {

//        switch (motionEvent.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                ObjectAnimator upAnim = ObjectAnimator.ofFloat(view, "translationZ", 16);
//                upAnim.setDuration(150);
//                upAnim.setInterpolator(new DecelerateInterpolator());
//                upAnim.start();
//                break;
//
//            case MotionEvent.ACTION_UP:
//            case MotionEvent.ACTION_CANCEL:
//                ObjectAnimator downAnim = ObjectAnimator.ofFloat(view, "translationZ", 0);
//                downAnim.setDuration(150);
//                downAnim.setInterpolator(new AccelerateInterpolator());
//                downAnim.start();
//                break;
//        }
        return false;
    }

    public void showAd() {
        try {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences("app", MODE_PRIVATE);
            if (!sharedPreferences.getBoolean("isDonated", false)) {
                AdRequest adRequest = new AdRequest.Builder().setRequestAgent("android_studio:ad_template").build();
                ad_view_dialog.loadAd(adRequest);

                Animation animation = new AlphaAnimation(0.0f, 1.0f);
                animation.setDuration(500);
                card_ad_dialog.setVisibility(View.VISIBLE);
                card_ad_dialog.startAnimation(animation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
