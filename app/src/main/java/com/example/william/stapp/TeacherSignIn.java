package com.example.william.stapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.william.stapp.main.menu.MenuActivity;

/**
 * Created by jason on 26/06/2017.
 */

public class TeacherSignIn extends AppCompatActivity {
    private Button next
    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.teacher_sign_in);
        findViewById(R.id.submitbutton2).setOnClickListener();
        next = (Button) findViewById(R.id.submitbutton2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View i) {
                Intent intent = new Intent(getBaseContext(), MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View i) {
        switch (i.getId()) {
            case R.id.submitbutton2:
                submit();
                break;
        }
    }

    private void submit() {
        //// TODO: 05-Sep-17 define
    }
}
