package com.awad.hamud.loginhamudi;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class REGISTER extends AppCompatActivity implements View.OnClickListener {
    private static final String PREF_FILE_NAME = "MuhammedPref" ;
    private EditText etNUserName;
    private EditText etNPass;
    private EditText etEmail;
    private Button btnSave;
    private Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etNUserName = (EditText) findViewById(R.id.etNUserName);
        etNPass = (EditText) findViewById(R.id.etNPass);
        etEmail = (EditText) findViewById(R.id.etEmail);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);
    }

    public void onClick(View view)
    {
        if (view == btnSave)
        {
            SharedPreferences prefs = getSharedPreferences(PREF_FILE_NAME, MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("user", etNUserName.getText().toString());
            editor.putString("passw", etNPass.getText().toString());
            editor.putString("mail", etEmail.getText().toString());
            editor.commit();

            Toast.makeText(this, "Succsfelly SAVED", Toast.LENGTH_SHORT).show();
            finish();

        }

    }
}

