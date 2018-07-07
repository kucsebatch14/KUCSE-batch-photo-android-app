package com.bluster.kucsebatch14.fragment;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


import android.view.Gravity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bluster.kucsebatch14.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import static android.content.Context.MODE_PRIVATE;

/**
 * Created by kucsebatch14 on 2018.07.6.
 */

//THis will process the card view
public class PhotoFragment extends Fragment implements View.OnClickListener, View.OnTouchListener {

    private ImageView img_main_card2_share, img_main_card2_bookmark, img_main_card2_favorite;
    private boolean isBookmarkClicked, isFavoriteClicked;
    private LinearLayout ll_card_main3_rate;

    //##########start album########
    private ImageView img_main_card_1, img_card_main_3,img_main_card_2,album_img_main_card_1,album_img_main_card_2,album_img_main_card_3,album_img_main_card_4,album_img_main_card_5,album_img_main_card_6,album_img_main_card_7,album_img_main_card_8,album_img_main_card_9,album_img_main_card_10,album_img_main_card_11,album_img_main_card_12,album_img_main_card_13,album_img_main_card_14,album_img_main_card_15,album_img_main_card_16,album_img_main_card_17,album_img_main_card_18,album_img_main_card_19,album_img_main_card_20,album_img_main_card_21,album_img_main_card_22,album_img_main_card_23,album_img_main_card_24,album_img_main_card_25,album_img_main_card_26,album_img_main_card_27,album_img_main_card_28;





    //##########start album########
    private CardView card_main_1_1, card_main_1_2,card_main_1_3,  album_id_header_1,album_id_header_2,album_id_header_3,album_id_header_4,album_id_header_5,album_id_header_6,album_id_header_7,album_id_header_8,album_id_header_9,album_id_header_10,album_id_header_11,album_id_header_12,album_id_header_13,album_id_header_14,album_id_header_15,album_id_header_16,album_id_header_17,album_id_header_18,album_id_header_19,album_id_header_20,album_id_header_21,album_id_header_22,album_id_header_23,album_id_header_24,album_id_header_25,album_id_header_26,album_id_header_27,album_id_header_28;


    private AlphaAnimation alphaAnimation, alphaAnimationShowIcon;
    private AdView ad_view_card;
    private CardView card_ad_card;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_photo, container, false);



        ll_card_main3_rate = nestedScrollView.findViewById(R.id.ll_card_main3_rate);

        //card view images
        img_main_card_1 = nestedScrollView.findViewById(R.id.img_main_card_1);
       // img_main_card_2 = nestedScrollView.findViewById(R.id.img_main_card_2);
        //##########start album########
        album_img_main_card_1 = nestedScrollView.findViewById(R.id.album_img_main_card_1);
       album_img_main_card_2 = nestedScrollView.findViewById(R.id.album_img_main_card_2);
        album_img_main_card_3 = nestedScrollView.findViewById(R.id.album_img_main_card_3);
        album_img_main_card_4 = nestedScrollView.findViewById(R.id.album_img_main_card_4);
        album_img_main_card_5 = nestedScrollView.findViewById(R.id.album_img_main_card_5);
        album_img_main_card_6 = nestedScrollView.findViewById(R.id.album_img_main_card_6);
        album_img_main_card_7 = nestedScrollView.findViewById(R.id.album_img_main_card_7);
        album_img_main_card_8 = nestedScrollView.findViewById(R.id.album_img_main_card_8);
        album_img_main_card_9 = nestedScrollView.findViewById(R.id.album_img_main_card_9);
        album_img_main_card_10 = nestedScrollView.findViewById(R.id.album_img_main_card_10);
        album_img_main_card_11 = nestedScrollView.findViewById(R.id.album_img_main_card_11);
        album_img_main_card_12 = nestedScrollView.findViewById(R.id.album_img_main_card_12);
        album_img_main_card_13 = nestedScrollView.findViewById(R.id.album_img_main_card_13);
        album_img_main_card_14 = nestedScrollView.findViewById(R.id.album_img_main_card_14);
        album_img_main_card_15 = nestedScrollView.findViewById(R.id.album_img_main_card_15);
        album_img_main_card_16 = nestedScrollView.findViewById(R.id.album_img_main_card_16);
        album_img_main_card_17 = nestedScrollView.findViewById(R.id.album_img_main_card_17);
        album_img_main_card_18 = nestedScrollView.findViewById(R.id.album_img_main_card_18);
        album_img_main_card_19 = nestedScrollView.findViewById(R.id.album_img_main_card_19);
        album_img_main_card_20 = nestedScrollView.findViewById(R.id.album_img_main_card_20);
        album_img_main_card_21 = nestedScrollView.findViewById(R.id.album_img_main_card_21);
        album_img_main_card_22 = nestedScrollView.findViewById(R.id.album_img_main_card_22);

        album_img_main_card_23 = nestedScrollView.findViewById(R.id.album_img_main_card_23);
        album_img_main_card_24 = nestedScrollView.findViewById(R.id.album_img_main_card_24);
        album_img_main_card_25 = nestedScrollView.findViewById(R.id.album_img_main_card_25);
        album_img_main_card_26 = nestedScrollView.findViewById(R.id.album_img_main_card_26);
        album_img_main_card_27 = nestedScrollView.findViewById(R.id.album_img_main_card_27);
        album_img_main_card_28 = nestedScrollView.findViewById(R.id.album_img_main_card_28);






        img_card_main_3 = nestedScrollView.findViewById(R.id.img_card_main_3);


        //calling full card view
        card_main_1_1 = nestedScrollView.findViewById(R.id.card_main_1_1);
        //card_main_1_2 = nestedScrollView.findViewById(R.id.card_main_1_2);
        //##########start album########

        album_id_header_1 = nestedScrollView.findViewById(R.id.album_id_header_1);
       album_id_header_2 = nestedScrollView.findViewById(R.id.album_id_header_2);
        album_id_header_3 = nestedScrollView.findViewById(R.id.album_id_header_3);
        album_id_header_4 = nestedScrollView.findViewById(R.id.album_id_header_4);
        album_id_header_5 = nestedScrollView.findViewById(R.id.album_id_header_5);
        album_id_header_6 = nestedScrollView.findViewById(R.id.album_id_header_6);
        album_id_header_7 = nestedScrollView.findViewById(R.id.album_id_header_7);
        album_id_header_8 = nestedScrollView.findViewById(R.id.album_id_header_8);
        album_id_header_9 = nestedScrollView.findViewById(R.id.album_id_header_9);
        album_id_header_10 = nestedScrollView.findViewById(R.id.album_id_header_10);
        album_id_header_11 = nestedScrollView.findViewById(R.id.album_id_header_11);
        album_id_header_12 = nestedScrollView.findViewById(R.id.album_id_header_12);
        album_id_header_13 = nestedScrollView.findViewById(R.id.album_id_header_13);
        album_id_header_14 = nestedScrollView.findViewById(R.id.album_id_header_14);
        album_id_header_15 = nestedScrollView.findViewById(R.id.album_id_header_15);
        album_id_header_16 = nestedScrollView.findViewById(R.id.album_id_header_16);
        album_id_header_17 = nestedScrollView.findViewById(R.id.album_id_header_17);
        album_id_header_18 = nestedScrollView.findViewById(R.id.album_id_header_18);
        album_id_header_19 = nestedScrollView.findViewById(R.id.album_id_header_19);
        album_id_header_20 = nestedScrollView.findViewById(R.id.album_id_header_20);
        album_id_header_21 = nestedScrollView.findViewById(R.id.album_id_header_21);
        album_id_header_22 = nestedScrollView.findViewById(R.id.album_id_header_22);

        album_id_header_23 = nestedScrollView.findViewById(R.id.album_id_header_23);
        album_id_header_24 = nestedScrollView.findViewById(R.id.album_id_header_24);
        album_id_header_25 = nestedScrollView.findViewById(R.id.album_id_header_25);
        album_id_header_26 = nestedScrollView.findViewById(R.id.album_id_header_26);
        album_id_header_27 = nestedScrollView.findViewById(R.id.album_id_header_27);
        album_id_header_28 = nestedScrollView.findViewById(R.id.album_id_header_28);



        card_main_1_3 = nestedScrollView.findViewById(R.id.card_main_1_3);


        //reading images with glide

        //##########start album########

        Glide.with(getContext()).load(R.drawable.pic_ragday).apply(new RequestOptions().fitCenter()).into(img_main_card_1);
   //     Glide.with(getContext()).load(R.drawable.pic_ragday).apply(new RequestOptions().fitCenter()).into(img_main_card_2);
        Glide.with(getContext()).load(R.drawable.pic_lastparty).apply(new RequestOptions().fitCenter()).into(album_img_main_card_1);
        Glide.with(getContext()).load(R.drawable.pic_lasttour).apply(new RequestOptions().fitCenter()).into(album_img_main_card_2);
        Glide.with(getContext()).load(R.drawable.pic_ragday).apply(new RequestOptions().fitCenter()).into(album_img_main_card_3);
        Glide.with(getContext()).load(R.drawable.pic_rupshabridge).apply(new RequestOptions().fitCenter()).into(album_img_main_card_4);
        Glide.with(getContext()).load(R.drawable.pic_farewell).apply(new RequestOptions().fitCenter()).into(album_img_main_card_5);
        Glide.with(getContext()).load(R.drawable.pic_festival).apply(new RequestOptions().fitCenter()).into(album_img_main_card_6);
        Glide.with(getContext()).load(R.drawable.pic_classroom).apply(new RequestOptions().fitCenter()).into(album_img_main_card_7);
        Glide.with(getContext()).load(R.drawable.pic_halllife).apply(new RequestOptions().fitCenter()).into(album_img_main_card_8);
        Glide.with(getContext()).load(R.drawable.pic_outcampus).apply(new RequestOptions().fitCenter()).into(album_img_main_card_9);
        Glide.with(getContext()).load(R.drawable.pic_noborsho).apply(new RequestOptions().fitCenter()).into(album_img_main_card_10);
        Glide.with(getContext()).load(R.drawable.pic_sundorbon).apply(new RequestOptions().fitCenter()).into(album_img_main_card_11);
        Glide.with(getContext()).load(R.drawable.pic_pastrag).apply(new RequestOptions().fitCenter()).into(album_img_main_card_12);
        Glide.with(getContext()).load(R.drawable.pic_plsundorbons).apply(new RequestOptions().fitCenter()).into(album_img_main_card_13);
        Glide.with(getContext()).load(R.drawable.pic_threebro).apply(new RequestOptions().fitCenter()).into(album_img_main_card_14);
        Glide.with(getContext()).load(R.drawable.pic_sport).apply(new RequestOptions().fitCenter()).into(album_img_main_card_15);
        Glide.with(getContext()).load(R.drawable.pic_night_dub).apply(new RequestOptions().fitCenter()).into(album_img_main_card_16);
        Glide.with(getContext()).load(R.drawable.pic_celebrationomega).apply(new RequestOptions().fitCenter()).into(album_img_main_card_17);
        Glide.with(getContext()).load(R.drawable.pic_batchbirthday).apply(new RequestOptions().fitCenter()).into(album_img_main_card_18);
        Glide.with(getContext()).load(R.drawable.pic_lastnight).apply(new RequestOptions().fitCenter()).into(album_img_main_card_19);
        Glide.with(getContext()).load(R.drawable.pic_sessional).apply(new RequestOptions().fitCenter()).into(album_img_main_card_20);
        Glide.with(getContext()).load(R.drawable.pic_helpdesk).apply(new RequestOptions().fitCenter()).into(album_img_main_card_21);
        Glide.with(getContext()).load(R.drawable.pic_orientation).apply(new RequestOptions().fitCenter()).into(album_img_main_card_22);

        Glide.with(getContext()).load(R.drawable.pic_farewelloikantik).apply(new RequestOptions().fitCenter()).into(album_img_main_card_23);
        Glide.with(getContext()).load(R.drawable.pic_panam).apply(new RequestOptions().fitCenter()).into(album_img_main_card_24);
        Glide.with(getContext()).load(R.drawable.pic_hillyvalley).apply(new RequestOptions().fitCenter()).into(album_img_main_card_25);
        Glide.with(getContext()).load(R.drawable.pic_oldcombined).apply(new RequestOptions().fitCenter()).into(album_img_main_card_26);
        Glide.with(getContext()).load(R.drawable.pic_sumit).apply(new RequestOptions().fitCenter()).into(album_img_main_card_27);
        Glide.with(getContext()).load(R.drawable.pic_cox).apply(new RequestOptions().fitCenter()).into(album_img_main_card_28);








        Glide.with(getContext()).load(R.drawable.material_design_11).apply(new RequestOptions().fitCenter()).into(img_card_main_3);

        ad_view_card = nestedScrollView.findViewById(R.id.ad_view_card);
        card_ad_card = nestedScrollView.findViewById(R.id.card_ad_card);


        return nestedScrollView;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        ll_card_main3_rate.setOnClickListener(this);


        //total card click action maker
        card_main_1_1.setOnClickListener(this);
     //   card_main_1_2.setOnClickListener(this);
        //##########start album########


        album_id_header_1.setOnClickListener(this);
        album_id_header_2.setOnClickListener(this);
        album_id_header_3.setOnClickListener(this);
        album_id_header_4.setOnClickListener(this);
        album_id_header_5.setOnClickListener(this);
        album_id_header_6.setOnClickListener(this);
        album_id_header_7.setOnClickListener(this);
        album_id_header_8.setOnClickListener(this);
        album_id_header_9.setOnClickListener(this);
        album_id_header_10.setOnClickListener(this);
        album_id_header_11.setOnClickListener(this);
        album_id_header_12.setOnClickListener(this);
        album_id_header_13.setOnClickListener(this);
        album_id_header_14.setOnClickListener(this);
        album_id_header_15.setOnClickListener(this);
        album_id_header_16.setOnClickListener(this);
        album_id_header_17.setOnClickListener(this);
        album_id_header_18.setOnClickListener(this);
        album_id_header_19.setOnClickListener(this);
        album_id_header_20.setOnClickListener(this);
        album_id_header_21.setOnClickListener(this);
        album_id_header_22.setOnClickListener(this);

        album_id_header_23.setOnClickListener(this);
        album_id_header_24.setOnClickListener(this);
        album_id_header_25.setOnClickListener(this);
        album_id_header_26.setOnClickListener(this);
        album_id_header_27.setOnClickListener(this);
        album_id_header_28.setOnClickListener(this);






        card_main_1_3.setOnClickListener(this);

        card_main_1_1.setOnTouchListener(this);
        //card_main_1_2.setOnTouchListener(this);
        //##########start album########


        album_id_header_1.setOnTouchListener(this);
        album_id_header_2.setOnTouchListener(this);
        album_id_header_3.setOnTouchListener(this);
        album_id_header_4.setOnTouchListener(this);
        album_id_header_5.setOnTouchListener(this);
        album_id_header_6.setOnTouchListener(this);
        album_id_header_7.setOnTouchListener(this);
        album_id_header_8.setOnTouchListener(this);
        album_id_header_9.setOnTouchListener(this);
        album_id_header_10.setOnTouchListener(this);
        album_id_header_11.setOnTouchListener(this);
        album_id_header_12.setOnTouchListener(this);
        album_id_header_13.setOnTouchListener(this);
        album_id_header_14.setOnTouchListener(this);
        album_id_header_15.setOnTouchListener(this);
        album_id_header_16.setOnTouchListener(this);
        album_id_header_17.setOnTouchListener(this);
        album_id_header_18.setOnTouchListener(this);
        album_id_header_19.setOnTouchListener(this);
        album_id_header_20.setOnTouchListener(this);
        album_id_header_21.setOnTouchListener(this);
        album_id_header_22.setOnTouchListener(this);

        album_id_header_23.setOnTouchListener(this);
        album_id_header_24.setOnTouchListener(this);
        album_id_header_25.setOnTouchListener(this);
        album_id_header_26.setOnTouchListener(this);
        album_id_header_27.setOnTouchListener(this);
        album_id_header_28.setOnTouchListener(this);







        card_main_1_3.setOnTouchListener(this);


        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(700);

        img_main_card_1.startAnimation(alphaAnimation);
       // img_main_card_2.startAnimation(alphaAnimation);

        album_img_main_card_1.startAnimation(alphaAnimation);
        album_img_main_card_2.startAnimation(alphaAnimation);
        album_img_main_card_3.startAnimation(alphaAnimation);
        album_img_main_card_4.startAnimation(alphaAnimation);
        album_img_main_card_5.startAnimation(alphaAnimation);
        album_img_main_card_6.startAnimation(alphaAnimation);
        album_img_main_card_7.startAnimation(alphaAnimation);
        album_img_main_card_8.startAnimation(alphaAnimation);
        album_img_main_card_9.startAnimation(alphaAnimation);
        album_img_main_card_10.startAnimation(alphaAnimation);
        album_img_main_card_11.startAnimation(alphaAnimation);
        album_img_main_card_12.startAnimation(alphaAnimation);
        album_img_main_card_13.startAnimation(alphaAnimation);
        album_img_main_card_14.startAnimation(alphaAnimation);
        album_img_main_card_15.startAnimation(alphaAnimation);
        album_img_main_card_16.startAnimation(alphaAnimation);
        album_img_main_card_17.startAnimation(alphaAnimation);
        album_img_main_card_18.startAnimation(alphaAnimation);
        album_img_main_card_19.startAnimation(alphaAnimation);
        album_img_main_card_20.startAnimation(alphaAnimation);
        album_img_main_card_21.startAnimation(alphaAnimation);
        album_img_main_card_22.startAnimation(alphaAnimation);

        album_img_main_card_23.startAnimation(alphaAnimation);
        album_img_main_card_24.startAnimation(alphaAnimation);
        album_img_main_card_25.startAnimation(alphaAnimation);
        album_img_main_card_26.startAnimation(alphaAnimation);
        album_img_main_card_27.startAnimation(alphaAnimation);
        album_img_main_card_28.startAnimation(alphaAnimation);




        alphaAnimationShowIcon = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimationShowIcon.setDuration(500);

        showAd();
    }




    @Override
    public void onClick(View view) {






        switch (view.getId()) {




//            case R.id.img_main_card2_bookmark:
//                if (!isBookmarkClicked) {
//                    img_main_card2_bookmark.setImageResource(R.drawable.ic_bookmark_black_24dp);
//                    img_main_card2_bookmark.startAnimation(alphaAnimationShowIcon);
//                    isBookmarkClicked = true;
//                } else {
//                    img_main_card2_bookmark.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
//                    img_main_card2_bookmark.startAnimation(alphaAnimationShowIcon);
//                    isBookmarkClicked = false;
//                }
//                break;
//
//            case R.id.img_main_card2_favorite:
//                if (!isFavoriteClicked) {
//                    img_main_card2_favorite.setImageResource(R.drawable.ic_favorite_black_24dp);
//                    img_main_card2_favorite.startAnimation(alphaAnimationShowIcon);
//                    img_main_card2_favorite.startAnimation(alphaAnimationShowIcon);
//                    isFavoriteClicked = true;
//                } else {
//                    img_main_card2_favorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
//                    img_main_card2_favorite.startAnimation(alphaAnimationShowIcon);
//                    img_main_card2_favorite.startAnimation(alphaAnimationShowIcon);
//                    isFavoriteClicked = false;
//                }
//                break;

//
//            case R.id.ll_card_main3_rate:
//                break;
//
//            case R.id.card_main_1_1:
//
//                break;
            //##########start album########

//            case R.id.card_main_1_2:
//
//
//
//
//
//                break;




            case R.id.album_id_header_1:

               final CustomTabsIntent intent1 = new CustomTabsIntent.Builder().build();
               final String url1 ="https://photos.google.com/share/AF1QipNWlf7b3TQ4GhxpBwhOhBvG7yeHueJMB0MR8COjuYZgso466mNfs8W80qc47-8BhA?key=NUJOQlNXeWRlWTdQaXVHeGFvOFFCbmR4VzlKYTZ3";
                intent1.launchUrl(getActivity(), Uri.parse(url1));

                break;

            case R.id.album_id_header_2:
                final CustomTabsIntent intent2 = new CustomTabsIntent.Builder().build();
                final String url2 ="https://photos.google.com/share/AF1QipNBhyIrV7572ikz9E55IYgrwMZ8XbT5MGwH8Dg3qHd90qZ3s9d9MJJgNhW2zGYq8w?key=VjlJNkJYSEFjWC1oNktuMkJ4UTlkMmJ3c0hkSVRR";
                intent2.launchUrl(getActivity(), Uri.parse(url2));

                break;
            case R.id.album_id_header_3:
                final CustomTabsIntent intent3 = new CustomTabsIntent.Builder().build();
                final String url3 ="https://photos.google.com/share/AF1QipO1BxtYjQHiT4AsJskP6Wkn6FLW7lYLwSWvvPdNqoUy3kFL14q2PPL-__b7z5x7AQ?key=cjg1SzFDSEtmdTlKa21HZHcyWW1la0ZnVzZRMVp3";
                intent3.launchUrl(getActivity(), Uri.parse(url3));
                break;



            case R.id.album_id_header_4:
                final CustomTabsIntent intent4 = new CustomTabsIntent.Builder().build();
                final String url4 ="https://photos.google.com/share/AF1QipOlagGjCo8ozwRK8D5sA8Xnouhg2cJkYltKZTdVroQ2iUvvdIjdZ39RgaVmXclO1w?key=Sng4U1JOc3I5Y05RV3lCVFl4cTA5eFl0eXZLZzB3";
                intent4.launchUrl(getActivity(), Uri.parse(url4));
                break;


            case R.id.album_id_header_5:
                final CustomTabsIntent intent5 = new CustomTabsIntent.Builder().build();
                final String url5 ="https://photos.google.com/share/AF1QipPCm7IVy9FWYcUJjAKfEMBZx5daiw8nK-zf1NioVnB5YRDQBXQYWSRmP-0L41T6aA?key=Q080RkZPSVRqbjU5d2ZrR0tHdXM1UVhmSDdpZzdR";
                intent5.launchUrl(getActivity(), Uri.parse(url5));
                break;


            case R.id.album_id_header_6:
                final CustomTabsIntent intent6 = new CustomTabsIntent.Builder().build();
                final String url6 ="https://photos.google.com/share/AF1QipMtKVbrPdtsxdoJ83Ovt4jtvU6zI_AOOKk6oQJatiyA9eWOfpx0xvfS9WwqgCIrrQ?key=TGJrX1EtMDRSTElIcUdvSEpzTW9lTEd6cDB0ei1n";
                intent6.launchUrl(getActivity(), Uri.parse(url6));
                break;




            case R.id.album_id_header_7:
                final CustomTabsIntent intent7 = new CustomTabsIntent.Builder().build();
                final String url7 ="https://photos.google.com/share/AF1QipNOcvzh5ZCGs7HcAekt0_4fHYEvDbb3Cbl-IvODgUWnfEgXkGpPOgBS6S0Y2foEyA?key=Q3ByLUpHYkZ6UGx5UW1kb3VMenA3bWRyMlBnbUlR";
                intent7.launchUrl(getActivity(), Uri.parse(url7));
                break;




            case R.id.album_id_header_8:
                final CustomTabsIntent intent8 = new CustomTabsIntent.Builder().build();
                final String url8 ="https://photos.google.com/share/AF1QipNX-B4gnWYhi8NmPHxWk6ubymX0X1TtqbcKbJ5jTnUEtEhjDVHK58JsmzUYt4PMaw?key=ZUlxWTJ4VlVIeWdPRFVSaTVKRzBOdEtrZDI5eThB";
                intent8.launchUrl(getActivity(), Uri.parse(url8));
                break;



            case R.id.album_id_header_9:
                final CustomTabsIntent intent9 = new CustomTabsIntent.Builder().build();
                final String url9 ="https://photos.google.com/share/AF1QipNUw3r296g6oT3K_c4lXaXLY077rR4XhgKl1kwi700udHqIe4F6ZIvKVLuvXVRlbQ?key=MG9fM2VNN0RjWXU1NWhrXzNUb1p1MW8xTEZjZnln";
                intent9.launchUrl(getActivity(), Uri.parse(url9));
                break;



            case R.id.album_id_header_10:
                final CustomTabsIntent intent10 = new CustomTabsIntent.Builder().build();
                final String url10 ="https://photos.google.com/share/AF1QipNvzdun-Z0gwlfOPF-S5RKgWDYlvOwuWDQ7YgmMU3RDAeIFzwzF581P6DEuZe_Jpw?key=X25xT202SDNuMVV1VTVRNFA3aWdpLXVXX2NnaWpB";
                intent10.launchUrl(getActivity(), Uri.parse(url10));
                break;




            case R.id.album_id_header_11:
                final CustomTabsIntent intent11 = new CustomTabsIntent.Builder().build();
                final String url11 ="https://photos.google.com/share/AF1QipPU9V1cTKDyWA85i3XnhDB1llV3ZdfIYbSV3lw2Lf_IJgXjq-CBKzb-o6iMEDQFtw?key=WVFwV3VoVXc5Q3NrRi1UQlRTRVlaRmRNOG1WVmhR";
                intent11.launchUrl(getActivity(), Uri.parse(url11));
                break;



            case R.id.album_id_header_12:
                final CustomTabsIntent intent12 = new CustomTabsIntent.Builder().build();
                final String url12 ="https://photos.google.com/share/AF1QipPQHnAX9nnzVvWOZT99QRnyI9r9PBKLBf2g_GT-HH7GWERzWJ-Dq5NGZ8JAFkeD4A?key=X05qWGFxVGtnbFRMb1lKTGEzQ0dIU0w1UU1KcEpn";
                intent12.launchUrl(getActivity(), Uri.parse(url12));
                break;



            case R.id.album_id_header_13:
                final CustomTabsIntent intent13 = new CustomTabsIntent.Builder().build();
                final String url13 ="https://photos.google.com/share/AF1QipOFt5LOLMRKPJkWYSJm4Fx17_Qgt93HXYtJwXH80u1xxFgld1pBeKP_hFfK-9Y72A?key=X1V3LXg5RFZaME5PUDB4X1ZFT1ZKY1FFUzUzVHdR";
                intent13.launchUrl(getActivity(), Uri.parse(url13));
                break;



            case R.id.album_id_header_14:
                final CustomTabsIntent intent14 = new CustomTabsIntent.Builder().build();
                final String url14 ="https://photos.google.com/share/AF1QipNcviKpujQ9CaBQcfGbUljBs8V7IGCtE9yJzWQcaxId7EnQrQK8Z9DHBuBLdDZdCw?key=ZXN5MXhBYWN3T0prcVNoSXBrTUVEdHA3UjlVMHNB";
                intent14.launchUrl(getActivity(), Uri.parse(url14));
                break;



            case R.id.album_id_header_15:
                final CustomTabsIntent intent15 = new CustomTabsIntent.Builder().build();
                final String url15 ="https://photos.google.com/share/AF1QipNT1rQ0afw-xnZZ-v4aC60eFwAMGVE6rGy-RV5D5PRPCNdikOg8dvHJnkadbfzqHg?key=M2poQTIwX2RQUGV5aGxOSXVkOGpkYXVsX2pUc1hB";
                intent15.launchUrl(getActivity(), Uri.parse(url15));
                break;



            case R.id.album_id_header_16:
                final CustomTabsIntent intent16 = new CustomTabsIntent.Builder().build();
                final String url16 ="https://photos.google.com/share/AF1QipNeemLIQ8ZHUnZ1isu1HkKMACsju4xb-GHqJu0t_JzOf33u3p60qMwgSr0pN6bevg?key=UndpOU0ybkxHZVk2Z0xLclgtakZNODlFVG5zc193";
                intent16.launchUrl(getActivity(), Uri.parse(url16));
                break;


            case R.id.album_id_header_17:
                final CustomTabsIntent intent17 = new CustomTabsIntent.Builder().build();
                final String url17 ="https://photos.google.com/share/AF1QipOHKyzdHVJT3qqK4QfnSTurBBSMdholk4zGYrvXFVLv9oNt6w6h_hVfTQNsrD5RIw?key=WHRVVnpFanhOQTZXajVDcXF6YXBIQXpELXlOQW1R";
                intent17.launchUrl(getActivity(), Uri.parse(url17));
                break;


            case R.id.album_id_header_18:
                final CustomTabsIntent intent18 = new CustomTabsIntent.Builder().build();
                final String url18 ="https://photos.google.com/share/AF1QipPnKPqqNQzYR7KYRmZ3CPstktoGvGLyEoMAqKv4-yX71NMretiJ9GHVDZ0SafEbOw?key=VlJVZnZlcWtQZkx5eGdCV0RCSGxWWDYxb0dSb2RB";
                intent18.launchUrl(getActivity(), Uri.parse(url18));
                break;


            case R.id.album_id_header_19:
                final CustomTabsIntent intent19 = new CustomTabsIntent.Builder().build();
                final String url19 ="https://photos.google.com/share/AF1QipPfv1lSrXWd9XIjR1vz8RwytwhZXjohXN1e61Z07pj5ic3A_JW9OyqK1BswXn8J3w?key=RWRGb1RkYVlrSmtydDk2bmFxVk5qTjg2NDdfZ0V3";
                intent19.launchUrl(getActivity(), Uri.parse(url19));
                break;


            case R.id.album_id_header_20:
                final CustomTabsIntent intent20 = new CustomTabsIntent.Builder().build();
                final String url20 ="https://photos.google.com/share/AF1QipOEgH3v6rZwoG6O_R6wLO7g_MmxoBel8_uMVgAq6Og62HQyvfNBYM1Z-lPpy4KjSg?key=RVBhRmxnaTdYRm4xMkpwNlQxeWdyLXhSdEE0ekxR";
                intent20.launchUrl(getActivity(), Uri.parse(url20));
                break;


            case R.id.album_id_header_21:
                final CustomTabsIntent intent21 = new CustomTabsIntent.Builder().build();
                final String url21 ="https://photos.google.com/share/AF1QipPxXFYUR9nmlxF37vcR472q2xLWYc-PebNg8szQaaRZPUNeqWBSR03DHkddDNPsiQ?key=ekNhS0E3cDFDQmFSYTc4RGVvODZDSzlMM0dBaXJ3";
                intent21.launchUrl(getActivity(), Uri.parse(url21));
                break;



            case R.id.album_id_header_22:
                final CustomTabsIntent intent22 = new CustomTabsIntent.Builder().build();
                final String url22 ="https://photos.google.com/share/AF1QipOYS1ult_H4RNtAtLx4b_hKiHguE5_4SuSN52vSlFOWOOcRNoN4QlIdd13032MfsA?key=eGNjX1dLTkwxa2V0eW9yOER5b3ZMbThwZURQaUpn";
                intent22.launchUrl(getActivity(), Uri.parse(url22));
                break;






            case R.id.album_id_header_23:
                final CustomTabsIntent intent23 = new CustomTabsIntent.Builder().build();
                final String url23 ="https://photos.google.com/share/AF1QipMa84sXkdEmYBh2x6IiySzCX1-kE0bWBIJcqrcwsvNrZkWTcdrpge4Xf7gt6rGNWA?key=ckJsWUo4M2VLVzFlbUVZYXVBY2wxdFM0UVBnRFl3";
                intent23.launchUrl(getActivity(), Uri.parse(url23));
                break;


            case R.id.album_id_header_24:
                final CustomTabsIntent intent24 = new CustomTabsIntent.Builder().build();
                final String url24 ="https://photos.google.com/share/AF1QipPqdeIXUjkuFq_rxTohSNMH6Ew6ZEb3EGPYEZ9yS9ujhw3m4NYe57XQEjEPZc409w?key=RnphTDNVLUFjNmJjME8xd2tSZExkQmRZRkZ2cm5n";
                intent24.launchUrl(getActivity(), Uri.parse(url24));
                break;



            case R.id.album_id_header_25:
                final CustomTabsIntent intent25 = new CustomTabsIntent.Builder().build();
                final String url25 ="https://photos.google.com/share/AF1QipOCOmLOAZe-p4F9Hj-NgXSM5b-pJl8V065PMkbU_fr1iYYqzWOo9KiWcV72IQF0LA?key=SGUweG5aRWlPelA2aFo4RmplR2FMUXVIYmRmZ0V3";
                intent25.launchUrl(getActivity(), Uri.parse(url25));
                break;


            case R.id.album_id_header_26:
                final CustomTabsIntent intent26 = new CustomTabsIntent.Builder().build();
                final String url26 ="https://photos.google.com/share/AF1QipOQ_seybr7kgH7-hAta2iQG1v08PaVich5glTW5t2YyNWlEN7zBzv4MPfN3fLTJNg?key=cjEtNmFBU0NzMEVRUE9KeEl0UXBJNGxtZ1BlV3Z3";
                intent26.launchUrl(getActivity(), Uri.parse(url26));
                break;


            case R.id.album_id_header_27:
                final CustomTabsIntent intent27 = new CustomTabsIntent.Builder().build();
                final String url27 ="https://photos.google.com/share/AF1QipOALJlOWtcNrt8afeSQi3NRCH4BEDqy_l04hqvvoy1dnRUlaOCI_xogcA2ffen7nQ?key=bWs0dUViZHhwdk04YzVvT25TNkoxSjY2R1VzUUZn";
                intent27.launchUrl(getActivity(), Uri.parse(url27));
                break;



            case R.id.album_id_header_28:
                final CustomTabsIntent intent28 = new CustomTabsIntent.Builder().build();
                final String url28 ="https://photos.google.com/share/AF1QipN8VPRRuGWuKzETPWgg1nW6dsoWcQnANqAOJB-8S7UkSJqdxDCCuDHIzoCJJKq6jA?key=Z0hvMldfSE9sSTBqYXhoczhVTUcybk9mZWxmVnZ3";
                intent28.launchUrl(getActivity(), Uri.parse(url28));
                break;

            case R.id.card_main_1_3:

                break;


        }


    }





    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                ObjectAnimator upAnim = ObjectAnimator.ofFloat(view, "translationZ", 16);
                upAnim.setDuration(150);
                upAnim.setInterpolator(new DecelerateInterpolator());
                upAnim.start();
                break;

            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                ObjectAnimator downAnim = ObjectAnimator.ofFloat(view, "translationZ", 0);
                downAnim.setDuration(150);
                downAnim.setInterpolator(new AccelerateInterpolator());
                downAnim.start();
                break;
        }
        return false;
    }

    public void showAd() {
        try {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences("app", MODE_PRIVATE);
            if (!sharedPreferences.getBoolean("isDonated", false)) {
                AdRequest adRequest = new AdRequest.Builder().setRequestAgent("android_studio:ad_template").build();
                ad_view_card.loadAd(adRequest);

                Animation animation = new AlphaAnimation(0.0f, 1.0f);
                animation.setDuration(500);
                card_ad_card.setVisibility(View.VISIBLE);
                card_ad_card.startAnimation(animation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
