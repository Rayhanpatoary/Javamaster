package com.example.rayhanpatoary.learnjavabangla;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open_home_fragment();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);






        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }








    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        Fragment fragment = null;
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            open_home_fragment();

            // Handle the camera action
        } else if (id == R.id.nav_instruction) {

            open_user_instruction();

        } else if (id == R.id.nav_codeing_Zone) {
            ProgressDialog progressDialog;
            progressDialog = ProgressDialog.show(MainActivity.this, "","Please Wait...", true);
            open_coding_zone();
            progressDialog.dismiss();


        } else if (id == R.id.nav_progress) {
            open_progress();
        }
        else if(id == R.id.nav_about_developer){
            open_about_developer();
        }
        else if (id == R.id.nav_send_feedback) {


        } else if (id == R.id.nav_community) {
            Intent fb_group = getOpenFacebookIntent(MainActivity.this);
            startActivity(fb_group);

        }
        else  if(id == R.id.nav_share){
            show_share_options();

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void open_progress() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new progress()).commit();
    }

    private void open_about_developer() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new about_developer()).commit();
    }

    private void open_user_instruction() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new user_instruction()).commit();
    }

    private void open_coding_zone() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new coding_tab()).commit();

    }
    void open_home_fragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new home()).commit();
    }

    private void show_share_options() {


            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "Your body here";
            String shareSub = "Your subject here";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share using"));


    }

    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://group/1582442718522576"));

        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/জাভার-মাস্টার-743906392616446/?modal=admin_todo_tour"));
        }
    }


}
