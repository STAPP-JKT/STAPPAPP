package com.example.william.stapp.SignIn;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.william.stapp.R;

/**
 * Created by jason on 26/06/2017.
 */

public class TeacherSignIn extends AppCompatActivity {
    private Button next;
    private SharedPreferences credentials;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;

    @Override// TODO: 22-Sep-17 see if ovveride is on the right position
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.teacher_sign_in);

        editText1 = (EditText) findViewById(R.id.firstnmteacher);
        editText2 = (EditText) findViewById(R.id.middlenmteacher);
        editText3 = (EditText) findViewById(R.id.lastnmteacher);

        credentials = getSharedPreferences("credentials", MODE_PRIVATE);

        editText1.setText(credentials.getString("tag", "default value"));
        editText2.setText(credentials.getString("tag", "default value"));
        editText3.setText(credentials.getString("tag", "default value"));
        // TODO: 26-Sep-17 change "tag" and "default value"
        findViewById(R.id.submitbutton2).setOnClickListener((View.OnClickListener) this);
        next = (Button) findViewById(R.id.submitbutton2);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View i) {
                Intent intent = new Intent(getBaseContext(), TeacherSignIn2.class);
                startActivity(intent);
                if (editText1.getText().length() > 0) {
                    makeTag(editText1.getText().toString());
                    ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(editText1.getWindowToken(), 0);
                }
                if (editText2.getText().length() >= 0) {
                    makeTag(editText2.getText().toString());
                    ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                }
                if (editText3.getText().length() > 0) {
                    makeTag(editText3.getText().toString());
                    ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(editText3.getWindowToken(), 0);
                }
                //// TODO: 27-Sep-17 may need to add additional arguments for backend use 
            }
        });
    }

    public void makeTag(String tag) {
        String or = credentials.getString(tag, null);
        SharedPreferences.Editor preferencesEditor = credentials.edit();
        preferencesEditor.putString("tag", tag);
        preferencesEditor.commit();
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
