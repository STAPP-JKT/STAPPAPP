package com.example.william.stapp.main.menu;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.william.stapp.R;



public class MenuActivity extends Activity {

        private String[] mNavigationDrawerItemsTitles;
        private DrawerLayout mDrawerLayout;
        private ListView mDrawerList;
        Toolbar toolbar;
        private CharSequence mDrawerTitle;
        private CharSequence mTitle;
        android.support.v7.app.ActionBarDrawerToggle mDrawerToggle;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);
            mTitle = mDrawerTitle = getTitle();
            mNavigationDrawerItemsTitles = getResources().getStringArray(R.array.navigation_drawer_item_array);
            mDrawerLayout = (DrawerLayout)findViewById(R.id.left_drawer);

            setupToolbar();

            DataModel[] drawerItem = new DataModel[3];
            //// TODO: 28-Aug-17 add drawable asset
            drawerItem[0] = new DataModel(R.drawable.privset, "Privacy Setting");
            drawerItem[1] = new DataModel(R.drawable.stats,"Achievements");

            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(true);

            DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this,R.layout.list_view_item_row, drawerItem);
            mDrawerList.setAdapter(adapter);
            mDrawerList.setOnItemClickListener(new DrawerItemClickListner());
            mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            mDrawerLayout.setDrawerListener(mDrawerToggle);
            setupDrawerToggle();
        }
        private class DrawerItemClickListner implements ListView.onItemClickListner{

            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id){
                selectItem(position);
            }
        }
        private void selectItem(int position){
            Fragment fragment = null;

            switch (position){
                case 0:
                    fragment = new PrivsetFragment();
                    break;

                case 1:
                    fragment = new StatsFragment();
                    break;

                default:
                    break;
            }
            if (fragment != null){
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_frame,fragment).commit();

                mDrawerList.setItemChecked(position,true);
                mDrawerList.setSelection(position);
                setTitle(mNavigationDrawerItemsTitles[position]);
                mDrawerLayout.closeDrawer(mDrawerList);
            }
            else {
                Log.e("MenuActivity", "Error in creating fragment");
            }
        }
        @Override
    public boolean onOptionsItemSelected(MenuItem item){
            if (mDrawerToggle.onOptionsItemSelected(item)){
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
        @Override
    public void setTitle(CharSequence title){
            mTitle = title;
            getSupportActionBar().setTitle(mTitle);
        }
        @Override
    protected void onPostCreate(Bundle savedInstanceState){
            super. onPostCreate(savedInstanceState);
            mDrawerToggle.syncState();
        }

        void setupToolbar(){
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnable(true);
        }
        void setupDrawerToggle(){
            mDrawerToggle = new android.support.v7.app.ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name,
                    R.string.app_name);
            //necessary to change icon of Drawer Toggle upon state change
            mDrawerToggle.syncState();
        }
    }