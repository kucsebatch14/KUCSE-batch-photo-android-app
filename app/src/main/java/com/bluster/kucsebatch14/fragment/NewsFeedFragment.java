package com.bluster.kucsebatch14.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.bluster.kucsebatch14.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by kucsebatch14 on 2018.07.6.
 */
public class NewsFeedFragment extends Fragment {


    private AdView ad_view_widget;
    private CardView card_ad_widget;
    private TextView tv_ad;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_feed, container, false);



        ad_view_widget = nestedScrollView.findViewById(R.id.ad_view_widget);
        card_ad_widget = nestedScrollView.findViewById(R.id.card_ad_widget);


        return nestedScrollView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        showAd();
    }

    public void showAd() {
        try {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences("app", MODE_PRIVATE);
            if (!sharedPreferences.getBoolean("isDonated", false)) {
                AdRequest adRequest = new AdRequest.Builder().setRequestAgent("android_studio:ad_template").build();
                ad_view_widget.loadAd(adRequest);

                Animation animation = new AlphaAnimation(0.0f, 1.0f);
                animation.setDuration(500);

                card_ad_widget.setVisibility(View.VISIBLE);
                card_ad_widget.startAnimation(animation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
