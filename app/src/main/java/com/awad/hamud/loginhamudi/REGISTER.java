package com.awad.hamud.loginhamudi;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class REGISTER extends AppCompatActivity
{
    private static final String PREF_FILE_NAME = ;
    private EditText etNUserName;
    private EditText etNPass;
    private EditText etEmail;
    private Button btnSave;
    private Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etNUserName = (EditText) findViewById(R.id.etNUserName);
        etNPass = (EditText) findViewById(R.id.etNPass);
        etEmail = (EditText) findViewById(R.id.etEmail);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);
    }
}
public onClick (View view)
{
    if (view==btnSave)
    {
        SharedPreferences prefs = getSharedPreferences(PREF_FILE_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
    }
}
