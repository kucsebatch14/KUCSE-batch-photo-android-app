package com.bluster.kucsebatch14.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.bluster.kucsebatch14.R;
import com.bluster.kucsebatch14.adapter.FragmentAdapter;
import com.bluster.kucsebatch14.fragment.PhotoFragment;
import com.bluster.kucsebatch14.fragment.InfoFragment;
import com.bluster.kucsebatch14.fragment.VideoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private DrawerLayout drawer;
    private FloatingActionButton fab;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private RelativeLayout relative_main;
    private ImageView img_page_start;

    private static boolean isShowPageStart = true;
    private final int MESSAGE_SHOW_DRAWER_LAYOUT = 0x001;
    private final int MESSAGE_SHOW_START_PAGE = 0x002;

//    public Handler mHandler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            switch (msg.what) {
//                case MESSAGE_SHOW_DRAWER_LAYOUT:
//                    drawer.openDrawer(GravityCompat.START);
//                    SharedPreferences sharedPreferences = getSharedPreferences("app", MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPreferences.edit();
//                    editor.putBoolean("isFirst", false);
//                    editor.apply();
//                    break;
//
//                case MESSAGE_SHOW_START_PAGE:
//                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
//                    alphaAnimation.setDuration(300);
//                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
//                        @Override
//                        public void onAnimationStart(Animation animation) {
//
//                        }
//
//                        @Override
//                        public void onAnimationEnd(Animation animation) {
//                            relative_main.setVisibility(View.GONE);
//                        }
//
//                        @Override
//                        public void onAnimationRepeat(Animation animation) {
//
//                        }
//                    });
//                    relative_main.startAnimation(alphaAnimation);
//                    break;
//            }
//        }
//    };

    //##################################################################
    //-------------------------------------------------------------------
    //This will start when the app will start out
    //--------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //showing the main activity
        setContentView(R.layout.activity_main);

        //--------------------------
        //drawer layout + nav view
        initView();                       //navigation drawer
        //--------------------------

        //---------------------------------------------
        //view of  the card view on the sliding menus's
        initViewPager();                                  //sliding menu
        //---------------------------------------------

        // init the preferences data of Settings
        try {
            PreferenceManager.setDefaultValues(this, R.xml.preferences_settings, false);
        } catch (Exception e) {
        }

        SharedPreferences sharedPreferences = getSharedPreferences("app", MODE_PRIVATE);

//        if (isShowPageStart) {
//            relative_main.setVisibility(View.VISIBLE);
//            Glide.with(MainActivity.this).load(R.drawable.ic_launcher_big).into(img_page_start);
//            if (sharedPreferences.getBoolean("isFirst", true)) {
//                mHandler.sendEmptyMessageDelayed(MESSAGE_SHOW_START_PAGE, 2000);
//            } else {
//                mHandler.sendEmptyMessageDelayed(MESSAGE_SHOW_START_PAGE, 1000);
//            }
//            isShowPageStart = false;
//        }
//
//        if (sharedPreferences.getBoolean("isFirst", true)) {
//            mHandler.sendEmptyMessageDelayed(MESSAGE_SHOW_DRAWER_LAYOUT, 2500);
//        }
    }
    //---------------------------------------------------------------------------------------
    //#######################################################################################



    //----------------------------------------------------------
    //setting up app nesearry view drawer layout + nav view in this method
    //----------------------------------------------------------
    private void initView() {

        //setting tool bar
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        //adding drawer layer out
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //setting the nav view
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        //setting the nav header
        View headerView = navigationView.getHeaderView(0);
        LinearLayout nav_header = headerView.findViewById(R.id.nav_header);
        nav_header.setOnClickListener(this);



        //adding two blank view to this
        relative_main = findViewById(R.id.relative_main);
        img_page_start = findViewById(R.id.img_page_start);
    }

    //--------------------------------------------------------------------



    //--------------------------------------------------------------------
    // Will process the view of  the card view on the sliding menus's
    //--------------------------------------------------------------------


    private void initViewPager() {

        //adding sliding tab layout and it's page
        mTabLayout = findViewById(R.id.tab_layout_main);
        mViewPager = findViewById(R.id.view_pager_main);

        List<String> titles = new ArrayList<>();

        //adding  three sliding menue title
        titles.add(getString(R.string.tab_title_main_1));
        titles.add(getString(R.string.tab_title_main_2));
        titles.add(getString(R.string.tab_title_main_3));


        //adding three tab layout  line by line
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(2)));


        //adding processed view of three sliding minue

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new PhotoFragment());  // calling the card name sliding part
        fragments.add(new InfoFragment()); //calling the dialog  name sliding part
        fragments.add(new VideoFragment()); //calling the widgets name sliding part

        mViewPager.setOffscreenPageLimit(2);// how many page will be in offline during the sliding time

        FragmentAdapter mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        mViewPager.setAdapter(mFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(mFragmentAdapter);

        mViewPager.addOnPageChangeListener(pageChangeListener);
    }

    //---------------------------------------------------------------------------------------



    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
//            if (position == 2) {
//                fab.show();
//            } else {
//                fab.hide();
//            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };


    //---------------------------------------------------
    //what happen when will we click the nav header
    //---------------------------------------------------
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.nav_header:
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//                DrawerLayout drawer = findViewById(R.id.drawer_layout);
//                drawer.closeDrawer(GravityCompat.START);
//                break;
//
//            case R.id.fab_main:
//                Snackbar.make(view, getString(R.string.main_snack_bar), Snackbar.LENGTH_LONG)
//                        .setAction(getString(R.string.main_snack_bar_action), new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//
//                            }
//                        }).show();
//                break;
        }
    }
//---------------------------------------------------------------


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //----------------------------------------------
    //upper bar side about menu
    //----------------------------------------------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_menu_main_1:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //-----------------------------------------------



    //-------------------------------------------------------
    //drawer layout button press work
    //-------------------------------------------------------
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Intent intent = new Intent();

        switch (item.getItemId()) {


            case R.id.nav_scrolling:
                intent.setClass(this, ScrollingActivity.class);
                startActivity(intent);
                break;






            case R.id.nav_about:
                intent.setClass(this, AboutActivity.class);
                startActivity(intent);
                break;




        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //------------------------------------------------------

    //---------------------------------
    //on the back button pressed
    //---------------------------------
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    //---------------------------------------------

//    @Override
//    protected void onDestroy() {
//        mHandler.removeCallbacksAndMessages(null);
//        super.onDestroy();
//    }

}
