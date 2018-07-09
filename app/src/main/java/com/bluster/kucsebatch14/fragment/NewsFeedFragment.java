package com.bluster.kucsebatch14.fragment;

import android.content.SharedPreferences;
import android.net.Uri;
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


import android.widget.ImageButton;
import android.widget.ImageView;



import android.content.Intent;
import com.google.android.youtube.player.YouTubePlayer;
import com.squareup.picasso.Picasso;
import com.thefinestartist.ytpa.YouTubePlayerActivity;
import com.thefinestartist.ytpa.enums.Orientation;
import com.thefinestartist.ytpa.enums.Quality;
import com.thefinestartist.ytpa.utils.YouTubeThumbnail;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by kucsebatch14 on 2018.07.6.
 */
public class NewsFeedFragment extends Fragment  implements View.OnClickListener {




    YouTubePlayer.PlayerStyle playerStyle;
    Orientation orientation;

    boolean showAudioUi;
    boolean showFadeAnim;

    public static String VIDEO_ID1 ="8NfybJi-mi0",VIDEO_ID2 ="-xvvmo2cISg",VIDEO_ID3 ="zXO9BwcAHNw", VIDEO_ID4= "eY7tXrYuho4", VIDEO_ID5="CvmwpyM6d0k",VIDEO_ID6="i1lB9bkrvQk" , VIDEO_ID7="L2EmjnO_uTw",VIDEO_ID8 ="cP2o6DDmhvY",VIDEO_ID9 ="Ap1nvfdpxYY",VIDEO_ID10 ="JRaHaIJz660", VIDEO_ID11= "SpQkuWGeDOA", VIDEO_ID12="mHI4Oj74mJw" , VIDEO_ID13="qyoa-B2sYLQ",VIDEO_ID14="8iefoPed6U4";

    private AdView ad_view_widget;
    private ImageView  youtube_thumnail_1, youtube_thumnail_2, youtube_thumnail_3,youtube_thumnail_4, youtube_thumnail_5, youtube_thumnail_6,youtube_thumnail_7, youtube_thumnail_8, youtube_thumnail_9,youtube_thumnail_10, youtube_thumnail_11, youtube_thumnail_12,youtube_thumnail_13,youtube_thumnail_14;
    private ImageButton play_bt_1,play_bt_2,play_bt_3,play_bt_4,play_bt_5,play_bt_6,play_bt_7,play_bt_8,play_bt_9,play_bt_10,play_bt_11,play_bt_12,play_bt_13,play_bt_14;
    private CardView card_ad_widget;
    private TextView tv_ad;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_feed, container, false);

        youtube_thumnail_1 = nestedScrollView.findViewById(R.id.youtube_thumnail_1);
        youtube_thumnail_2 = nestedScrollView.findViewById(R.id.youtube_thumnail_2);
        youtube_thumnail_3 = nestedScrollView.findViewById(R.id.youtube_thumnail_3);
        youtube_thumnail_4 = nestedScrollView.findViewById(R.id.youtube_thumnail_4);
        youtube_thumnail_5 = nestedScrollView.findViewById(R.id.youtube_thumnail_5);
        youtube_thumnail_6 = nestedScrollView.findViewById(R.id.youtube_thumnail_6);
        youtube_thumnail_7 = nestedScrollView.findViewById(R.id.youtube_thumnail_7);
        youtube_thumnail_8 = nestedScrollView.findViewById(R.id.youtube_thumnail_8);
        youtube_thumnail_9 = nestedScrollView.findViewById(R.id.youtube_thumnail_9);
        youtube_thumnail_10 = nestedScrollView.findViewById(R.id.youtube_thumnail_10);
        youtube_thumnail_11 = nestedScrollView.findViewById(R.id.youtube_thumnail_11);
        youtube_thumnail_12= nestedScrollView.findViewById(R.id.youtube_thumnail_12);
        youtube_thumnail_13= nestedScrollView.findViewById(R.id.youtube_thumnail_13);
        youtube_thumnail_14= nestedScrollView.findViewById(R.id.youtube_thumnail_14);


        play_bt_1 = nestedScrollView.findViewById(R.id.play_bt_1);
        play_bt_2 = nestedScrollView.findViewById(R.id.play_bt_2);
        play_bt_3 = nestedScrollView.findViewById(R.id.play_bt_3);

        play_bt_4 = nestedScrollView.findViewById(R.id.play_bt_4);
        play_bt_5 = nestedScrollView.findViewById(R.id.play_bt_5);
        play_bt_6 = nestedScrollView.findViewById(R.id.play_bt_6);

        play_bt_7 = nestedScrollView.findViewById(R.id.play_bt_7);
        play_bt_8 = nestedScrollView.findViewById(R.id.play_bt_8);
        play_bt_9 = nestedScrollView.findViewById(R.id.play_bt_9);

        play_bt_10 = nestedScrollView.findViewById(R.id.play_bt_10);
        play_bt_11= nestedScrollView.findViewById(R.id.play_bt_11);
        play_bt_12= nestedScrollView.findViewById(R.id.play_bt_12);
        play_bt_13= nestedScrollView.findViewById(R.id.play_bt_13);
        play_bt_14= nestedScrollView.findViewById(R.id.play_bt_14);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID1,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_1);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID2,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_2);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID3,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_3);





        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID4,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_4);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID5,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_5);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID6,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_6);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID7,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_7);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID8,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_8);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID9,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_9);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID10,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_10);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID11,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_11);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID12,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_12);
        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID13,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_13);

        Picasso.with(getActivity())
                .load(YouTubeThumbnail.getUrlFromVideoId(VIDEO_ID14,Quality.HIGH))
                .fit()
                .centerCrop()
                .into(youtube_thumnail_14);







        ad_view_widget = nestedScrollView.findViewById(R.id.ad_view_widget);
        card_ad_widget = nestedScrollView.findViewById(R.id.card_ad_widget);


        return nestedScrollView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        play_bt_1.setOnClickListener(this);
        play_bt_2.setOnClickListener(this);
        play_bt_3.setOnClickListener(this);

        play_bt_4.setOnClickListener(this);
        play_bt_5.setOnClickListener(this);
        play_bt_6.setOnClickListener(this);
        play_bt_7.setOnClickListener(this);
        play_bt_8.setOnClickListener(this);
        play_bt_9.setOnClickListener(this);
        play_bt_10.setOnClickListener(this);
        play_bt_11.setOnClickListener(this);
        play_bt_12.setOnClickListener(this);
        play_bt_13.setOnClickListener(this);
        play_bt_14.setOnClickListener(this);

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

    @Override
    public void onClick(View view) {


        switch (view.getId()) {

            case R.id.play_bt_1:
                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID1);
                intent.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent, 1);

                break;

            case R.id.play_bt_2:
                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent1 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent1.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID2);
                intent1.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent1.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent1.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent1.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent1.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent1.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent1.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent1.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent1, 1);



                break;

            case R.id.play_bt_3:

                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent2 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent2.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID3);
                intent2.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent2.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent2.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent2.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent2.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent2.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent2.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent2.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent2, 1);

                break;

            case R.id.play_bt_4:
                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent3 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent3.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID4);
                intent3.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent3.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent3.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent3.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent3.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent3.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent3.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent3.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent3, 1);

                break;

            case R.id.play_bt_5:
                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent4 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent4.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID5);
                intent4.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent4.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent4.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent4.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent4.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent4.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent4.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent4.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent4, 1);



                break;

            case R.id.play_bt_6:

                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent5 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent5.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID6);
                intent5.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent5.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent5.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent5.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent5.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent5.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent5.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent5.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent5, 1);

                break;
            case R.id.play_bt_7:
                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent6 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent6.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID7);
                intent6.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent6.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent6.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent6.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent6.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent6.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent6.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent6.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent6, 1);

                break;

            case R.id.play_bt_8:
                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent7 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent7.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID8);
                intent7.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent7.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent7.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent7.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent7.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent7.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent7.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent7.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent7, 1);



                break;

            case R.id.play_bt_9:

                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent8 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent8.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID9);
                intent8.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent8.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent8.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent8.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent8.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent8.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent8.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent8.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent8.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent8, 1);

                break;

            case R.id.play_bt_10:
                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent9 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent9.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID10);
                intent9.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent9.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent9.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent9.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent9.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent9.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent9.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent9.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent9.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent9, 1);

                break;

            case R.id.play_bt_11:
                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent10 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent10.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID11);
                intent10.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent10.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent10.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent10.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent10.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent10.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent10.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent10.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent10.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent10, 1);



                break;

            case R.id.play_bt_12:

                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent11 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent11.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID12);
                intent11.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent11.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent11.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent11.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent11.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent11.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent11.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent11.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent11.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent11, 1);

                break;

            case R.id.play_bt_13:

                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent12 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent12.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID13);
                intent12.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent12.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent12.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent12.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent12.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent12.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent12.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent12.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent12.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent12, 1);

                break;

            case R.id.play_bt_14:

                playerStyle = YouTubePlayer.PlayerStyle.DEFAULT;
                orientation =orientation.AUTO;
                showAudioUi =true;
                showFadeAnim=true;



                Intent intent13 = new Intent(getActivity(), YouTubePlayerActivity.class);
                intent13.putExtra(YouTubePlayerActivity.EXTRA_VIDEO_ID, VIDEO_ID14);
                intent13.putExtra(YouTubePlayerActivity.EXTRA_PLAYER_STYLE, playerStyle);
                intent13.putExtra(YouTubePlayerActivity.EXTRA_ORIENTATION, orientation);
                intent13.putExtra(YouTubePlayerActivity.EXTRA_SHOW_AUDIO_UI, showAudioUi);
                intent13.putExtra(YouTubePlayerActivity.EXTRA_HANDLE_ERROR, true);
                if (showFadeAnim) {
                    intent13.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.fade_in);
                    intent13.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.fade_out);
                } else {
                    intent13.putExtra(YouTubePlayerActivity.EXTRA_ANIM_ENTER, R.anim.modal_close_enter);
                    intent13.putExtra(YouTubePlayerActivity.EXTRA_ANIM_EXIT, R.anim.modal_close_exit);
                }
                intent13.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivityForResult(intent13, 1);

                break;






        }
    }
}
