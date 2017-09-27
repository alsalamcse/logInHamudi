package com.awad.hamud.loginhamudi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LOGIN extends AppCompatActivity implements View.OnClickListener
{
    private static final String PREF_FILE_NAME = "MuhammedPref" ;
    private EditText etUName;
    private EditText etPass;
    private Button btnLogin;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUName = (EditText) findViewById(R.id.etUName);
        etPass = (EditText) findViewById(R.id.etPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSignup);
    }


public void onClick (View view){
    if (view==btnLogin)
    {
    SharedPreferences prefs = getSharedPreferences(
            PREF_FILE_NAME,MODE_PRIVATE);
    String user = prefs.getString("user", null);
    String passw = prefs.getString("passw" ,null);
    if (user !=null || passw!=null)
        Toast.makeText(this, "Succsfully logged", Toast.LENGTH_SHORT).show();
        finish();

        if (view==btnSignup){
            Intent intent = new Intent(this,REGISTER.class);
        }


}
}
