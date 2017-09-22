package com.example.william.stapp.SignIn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.example.william.stapp.R;
import com.example.william.stapp.main.menu.MenuActivity;

/**
 * Created by jason on 26/06/2017.
 */

public class StudentSignIn extends AppCompatActivity {
    private Button next;
    private SharedPreferences credentials;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    @Override //// TODO: 22-Sep-17 see if ovveride is on the right position 
    protected void onCreate (Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.student_sign_in);

        editText1 = (EditText)findViewById(R.id.firstnmstudent);
        editText2 = (EditText)findViewById(R.id.middlenmstudent);
        editText3 = (EditText)findViewById(R.id.lastnmstudent);

        credentials = getSharedPreferences("credentials",MODE_PRIVATE);

        editText1.setText(credentials.getString("tag", "Default Value"));
        editText2.setText(credentials.getString("tag", "Default Value"));
        editText3.setText(credentials.getString("tag", "Default Value"));

        findViewById(R.id.submitbutton1).setOnClickListener((View.OnClickListener) this);
        next = (Button) findViewById(R.id.submitbutton1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View i) {
             Intent intent = new Intent(getBaseContext(), MenuActivity.class);
                startActivity(intent);
                if(editText1.getText().length()>0){
                    makeTag(editText1.getText().toString());

                    ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(editText1.getWindowToken(),0);
                }
                if(editText2.getText().length()>0){
                    makeTag(editText2.getText().toString());

                    ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(editText2.getWindowToken(),0);
                }
                if(editText3.getText().length()>0){
                    makeTag(editText3.getText().toString());

                    ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(editText3.getWindowToken(),0);
                }

        }
        });
    }
    private void makeTag(String tag){
        String or = credentials.getString(tag, null);
        SharedPreferences.Editor preferencesEditor = credentials.edit();
        preferencesEditor.putString("tag",tag); //change this line to this
        preferencesEditor.commit();
    }

    public void onClick(View i){
        switch (i.getId()){
            case R.id.submitbutton1:
                submit();
                break;
        }
    }

    private void submit() {
        //// TODO: 01-Sep-17 define
    }

}

