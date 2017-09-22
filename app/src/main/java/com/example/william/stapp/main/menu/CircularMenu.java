package com.example.william.stapp.main.menu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.william.stapp.R;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

/**
 * Created by William on 18-Sep-17.
 */

public class CircularMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circular_menu);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        //TODO circleMenu.setMainMenu(Color.parseColor("#main color"),add icon,remove icon)
            .addSubMenu(Color.parseColor("#color"),drawable)
            .addSubMenu
            .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                @Override
                public void onMenuSelected(int index) {
                    //TODO this happens when selected
                }
            })

    }



}
