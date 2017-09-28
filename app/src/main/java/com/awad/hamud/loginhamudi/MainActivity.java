package com.awad.hamud.loginhamudi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btngo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngo = (Button) findViewById(R.id.btngo);
    }

    public void onClick(View v) {
        if (v == btngo) {
            Intent intent = new Intent(this, LOGIN.class);
            startActivity(intent);

        }
    }
}
